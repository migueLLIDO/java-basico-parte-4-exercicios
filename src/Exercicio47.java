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
public class Exercicio47 {
sealed interface Comando permits Criar,Cancelar,Consultar{}record Criar(String id)implements Comando{}record Cancelar(String id)implements Comando{}record Consultar(String id)implements Comando{}static String processar(Comando c){return switch(c){case Criar x->"Criado "+x.id();case Cancelar x->"Cancelado "+x.id();case Consultar x->"Consultado "+x.id();};}
 public static void main(String[] args){for(Comando c:List.of(new Criar("1"),new Consultar("1"),new Cancelar("1")))System.out.println(processar(c));}
}

