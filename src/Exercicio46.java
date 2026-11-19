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
public class Exercicio46 {
interface Desconto{BigDecimal aplicar(BigDecimal v);}static class Vip implements Desconto{public BigDecimal aplicar(BigDecimal v){return v.multiply(new BigDecimal("0.90"));}}static class SemDesconto implements Desconto{public BigDecimal aplicar(BigDecimal v){return v;}}static class Checkout{BigDecimal total(BigDecimal v,Desconto d){return d.aplicar(v);}}
 public static void main(String[] args){Checkout c=new Checkout();System.out.println(c.total(new BigDecimal("100"),new Vip()));}
}

