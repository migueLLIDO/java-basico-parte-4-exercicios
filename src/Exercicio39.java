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
public class Exercicio39 {
interface Repositorio<T>{void salvar(String id,T valor);Optional<T> buscar(String id);}static class RepositorioMemoria<T>implements Repositorio<T>{private final Map<String,T> dados=new HashMap<>();public void salvar(String id,T x){dados.put(id,x);}public Optional<T> buscar(String id){return Optional.ofNullable(dados.get(id));}}record Cliente(String nome){}
 public static void main(String[] args){Repositorio<Cliente> r=new RepositorioMemoria<>();r.salvar("1",new Cliente("Ana"));System.out.println(r.buscar("1"));}
}

