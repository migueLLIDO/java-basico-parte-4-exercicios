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
public class Exercicio33 {
interface Pagamento{boolean pagar(double valor);}interface Frete{double calcular(double km);}static class Checkout{private final Pagamento p;private final Frete f;Checkout(Pagamento p,Frete f){this.p=p;this.f=f;}double fechar(double produtos,double km){double total=produtos+f.calcular(km);if(!p.pagar(total))throw new IllegalStateException("Pagamento recusado");return total;}}
 public static void main(String[] args){Checkout c=new Checkout(v->v<1000,km->km*1.5);System.out.println(c.fechar(250,8));}
}

