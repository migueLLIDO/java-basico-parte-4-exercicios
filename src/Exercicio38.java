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
public class Exercicio38 {
interface Notificador{void enviar(String texto);}static class Email implements Notificador{public void enviar(String t){System.out.println("Email: "+t);}}static class SMS implements Notificador{public void enviar(String t){System.out.println("SMS: "+t);}}static class Console implements Notificador{public void enviar(String t){System.out.println("Console: "+t);}}static Notificador criar(String tipo){return switch(tipo.toUpperCase()){case "EMAIL"->new Email();case "SMS"->new SMS();default->new Console();};}
 public static void main(String[] args){criar("SMS").enviar("Aviso");}
}

