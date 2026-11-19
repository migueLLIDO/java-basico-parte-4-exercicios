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
public class Exercicio43 {
interface GatewayPagamento{boolean cobrar(BigDecimal valor);}static class GatewaySimulado implements GatewayPagamento{public boolean cobrar(BigDecimal v){return v.signum()>0;}}static class GatewayFake implements GatewayPagamento{public boolean cobrar(BigDecimal v){return true;}}static class Checkout{private final GatewayPagamento gateway;Checkout(GatewayPagamento g){gateway=g;}boolean pagar(BigDecimal v){return gateway.cobrar(v);}}
 public static void main(String[] args){System.out.println(new Checkout(new GatewayFake()).pagar(new BigDecimal("50")));}
}

