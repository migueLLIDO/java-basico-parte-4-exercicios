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
public class Exercicio32 {
interface CalculadoraFrete{double calcular(double km);}static class Normal implements CalculadoraFrete{public double calcular(double k){return 8+k*1.2;}}static class Expresso implements CalculadoraFrete{public double calcular(double k){return 18+k*2;}}static class Retirada implements CalculadoraFrete{public double calcular(double k){return 0;}}
 public static void main(String[] args){for(CalculadoraFrete c:List.of(new Normal(),new Expresso(),new Retirada()))System.out.println(c.calcular(10));}
}

