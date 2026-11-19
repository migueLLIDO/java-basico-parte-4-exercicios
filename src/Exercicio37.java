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
public class Exercicio37 {
sealed interface Resultado permits Sucesso,Erro{}record Sucesso(String valor)implements Resultado{}record Erro(String mensagem)implements Resultado{}static String apresentar(Resultado r){return switch(r){case Sucesso s->"OK: "+s.valor();case Erro e->"ERRO: "+e.mensagem();};}
 public static void main(String[] args){System.out.println(apresentar(new Sucesso("feito")));System.out.println(apresentar(new Erro("inválido")));}
}

