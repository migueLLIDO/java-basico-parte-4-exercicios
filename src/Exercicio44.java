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
public class Exercicio44 {
interface EmailSender{void email(String para,String msg);}interface SmsSender{void sms(String telefone,String msg);}interface PushSender{void push(String token,String msg);}static class EmailOnly implements EmailSender{public void email(String p,String m){System.out.println("email -> "+p);}}
 public static void main(String[] args){new EmailOnly().email("ana@exemplo.com","Olá");}
}

