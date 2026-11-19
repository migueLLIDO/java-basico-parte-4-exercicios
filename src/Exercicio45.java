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
public class Exercicio45 {
interface Ave{void comer();}interface Voadora extends Ave{void voar();}static class Passaro implements Voadora{public void comer(){System.out.println("come");}public void voar(){System.out.println("voa");}}static class Pinguim implements Ave{public void comer(){System.out.println("come peixe");}}static void alimentar(Ave a){a.comer();}
 public static void main(String[] args){alimentar(new Passaro());alimentar(new Pinguim());}
}

