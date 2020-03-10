package projeto1;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   ler.useLocale(Locale.US);  
   double n;
   double cont = 0;

do {
     System.out.printf("Entre com uma moeda de 10 ou 25:\n");
     n = ler.nextDouble();
     if(n == 0.25 || n == 0.10) {
     cont+=n;
     }else {
     System.out.println("a moeda não é de 10 ou 25 ! muito obrigado pela sua moeda!!!");
     }
} while (cont < 0.45);
   
    System.out.printf("\n  ====== muito obrigado pela sua compra Receba sua Coca Cola =======\n");
   
 }

}