import java.io.*;
import java.math.*;
import java.net.*;
import java.net.http.*;
import java.nio.file.*;
import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.sql.DataSource;
public class Exercicio34 {
record Pedido(String id,double total){}interface PedidoRepository{void salvar(Pedido p);}static class Memoria implements PedidoRepository{public void salvar(Pedido p){System.out.println("Persistido "+p);}}static class Recibo{void imprimir(Pedido p){System.out.println("Recibo "+p.id()+" R$"+p.total());}}static class Servico{private final PedidoRepository repo;Servico(PedidoRepository r){repo=r;}void registrar(Pedido p){if(p.total()<=0)throw new IllegalArgumentException();repo.salvar(p);}}
 public static void main(String[] args){Pedido p=new Pedido("P-1",120);new Servico(new Memoria()).registrar(p);new Recibo().imprimir(p);}
}

