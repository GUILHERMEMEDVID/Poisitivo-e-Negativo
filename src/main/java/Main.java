import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Coloque um numero");
    int numero = sc.nextInt();
    System.out.println("O numero digitado foi: " + numero);
    if (numero > 0) {
      System.out.println("Numero positivo");
    } else if (numero < 0) {
      System.out.println("Numero negativo");
    }
sc.close();
  }

}