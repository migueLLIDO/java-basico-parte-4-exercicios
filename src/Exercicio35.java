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
public class Exercicio35 {
record Email(String valor){Email{if(valor==null||!valor.contains("@")||valor.indexOf("@")!=valor.lastIndexOf("@")||!valor.substring(valor.indexOf("@")+1).contains("."))throw new IllegalArgumentException("E-mail inválido");}String dominio(){return valor.substring(valor.indexOf('@')+1);}}
 public static void main(String[] args){System.out.println(new Email("ana@exemplo.com").dominio());}
}


