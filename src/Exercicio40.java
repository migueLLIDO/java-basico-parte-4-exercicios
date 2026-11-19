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
public class Exercicio40 {
record Cliente(String nome,double limite){Cliente{if(nome==null||nome.isBlank()||limite<0)throw new IllegalArgumentException("Cliente inválido");}}static Cliente ler(Scanner s){System.out.print("Nome: ");String nome=s.nextLine();System.out.print("Limite: ");double limite=Double.parseDouble(s.nextLine());return new Cliente(nome,limite);}
 public static void main(String[] args){try(Scanner s=new Scanner(System.in)){System.out.println(ler(s));}}
}

