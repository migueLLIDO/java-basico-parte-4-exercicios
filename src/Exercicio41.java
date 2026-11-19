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
public class Exercicio41 {
record Produto(String nome,BigDecimal preco){}record ItemCarrinho(Produto produto,int quantidade){ItemCarrinho{if(quantidade<=0)throw new IllegalArgumentException();}BigDecimal subtotal(){return produto.preco().multiply(BigDecimal.valueOf(quantidade));}}record Cupom(BigDecimal percentual){BigDecimal aplicar(BigDecimal x){return x.multiply(BigDecimal.ONE.subtract(percentual));}}static class Carrinho{private final List<ItemCarrinho> itens=new ArrayList<>();void adicionar(ItemCarrinho i){itens.add(i);}BigDecimal total(Cupom c){BigDecimal t=itens.stream().map(ItemCarrinho::subtotal).reduce(BigDecimal.ZERO,BigDecimal::add);return c==null?t:c.aplicar(t);}}
 public static void main(String[] args){Carrinho c=new Carrinho();c.adicionar(new ItemCarrinho(new Produto("Livro",new BigDecimal("80.00")),2));System.out.println(c.total(new Cupom(new BigDecimal("0.10"))));}
}

