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
public class Exercicio49 {
enum Status{CRIADO,PAGO,ENVIADO}record Pedido(String id,BigDecimal total,Status status){}record Item(String sku,int quantidade){}record Cliente(String id,String nome){}record Produto(String sku,BigDecimal preco){}interface RepoPedido{void salvar(Pedido p);}interface Pagador{boolean pagar(BigDecimal t);}static class MemRepo implements RepoPedido{public void salvar(Pedido p){System.out.println("salvo "+p.id());}}static class PedidoService{private final RepoPedido repo;private final Pagador pagador;PedidoService(RepoPedido r,Pagador p){repo=r;pagador=p;}Pedido criar(String id,BigDecimal total){if(!pagador.pagar(total))throw new IllegalStateException();Pedido p=new Pedido(id,total,Status.PAGO);repo.salvar(p);return p;}}
 public static void main(String[] args){new PedidoService(new MemRepo(),v->true).criar("P-1",new BigDecimal("50"));}
}

