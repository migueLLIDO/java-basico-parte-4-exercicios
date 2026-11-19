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
public class Exercicio50 {
record Aluno(String id,String nome){}record Curso(String nome,int vagas){}interface MatriculaRepo{void salvar(String aluno,String curso);}interface PoliticaAprovacao{boolean pode(Aluno a,Curso c);}static class RepoMem implements MatriculaRepo{public void salvar(String a,String c){System.out.println(a+" matriculado em "+c);}}static class SistemaAcademico{private final MatriculaRepo repo;private final PoliticaAprovacao regra;SistemaAcademico(MatriculaRepo r,PoliticaAprovacao p){repo=r;regra=p;}void matricular(Aluno a,Curso c){if(!regra.pode(a,c))throw new IllegalStateException("Sem vaga");repo.salvar(a.id(),c.nome());}}
 public static void main(String[] args){new SistemaAcademico(new RepoMem(),(a,c)->c.vagas()>0).matricular(new Aluno("1","Nina"),new Curso("POO",12));}
}

