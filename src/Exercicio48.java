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
public class Exercicio48 {
record Livro(String isbn,String titulo){}record Usuario(String id,String nome){}record Emprestimo(Livro livro,Usuario usuario,LocalDate retirada,LocalDate vencimento){}interface PoliticaEmprestimo{int dias();}static class PoliticaPadrao implements PoliticaEmprestimo{public int dias(){return 14;}}static Emprestimo emprestar(Livro l,Usuario u,LocalDate d,PoliticaEmprestimo p){return new Emprestimo(l,u,d,d.plusDays(p.dias()));}
 public static void main(String[] args){System.out.println(emprestar(new Livro("1","Java"),new Usuario("u1","Ana"),LocalDate.now(),new PoliticaPadrao()));}
}

