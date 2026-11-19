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
public class Exercicio31 {
enum Status{NOVO,PAGO,ENVIADO,CANCELADO}static class Pedido{Status status=Status.NOVO;void pagar(){if(status!=Status.NOVO)throw new IllegalStateException();status=Status.PAGO;}void enviar(){if(status!=Status.PAGO)throw new IllegalStateException();status=Status.ENVIADO;}void cancelar(){if(status==Status.ENVIADO||status==Status.CANCELADO)throw new IllegalStateException();status=Status.CANCELADO;}}
 public static void main(String[] args){Pedido p=new Pedido();p.pagar();p.enviar();System.out.println(p.status);}
}

