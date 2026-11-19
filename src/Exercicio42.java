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
public class Exercicio42 {
record Operacao(String tipo,BigDecimal valor){}static class Conta{private BigDecimal saldo=BigDecimal.ZERO;private final List<Operacao> historico=new ArrayList<>();void depositar(BigDecimal v){positivo(v);saldo=saldo.add(v);historico.add(new Operacao("DEPÓSITO",v));}void sacar(BigDecimal v){positivo(v);if(saldo.compareTo(v)<0)throw new IllegalStateException("Saldo insuficiente");saldo=saldo.subtract(v);historico.add(new Operacao("SAQUE",v));}void transferir(Conta destino,BigDecimal v){sacar(v);destino.depositar(v);}BigDecimal saldo(){return saldo;}List<Operacao> historico(){return List.copyOf(historico);}static void positivo(BigDecimal v){if(v.signum()<=0)throw new IllegalArgumentException("Valor deve ser positivo");}}
 public static void main(String[] args){Conta a=new Conta(),b=new Conta();a.depositar(new BigDecimal("100"));a.transferir(b,new BigDecimal("35"));System.out.println(a.saldo()+" -> "+b.saldo());}
}

