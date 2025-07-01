import java.util.Scanner;

public class InverteNumero {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int value = input.nextInt();

    System.out.println(inverteNumero(value));

    input.close();
  }

  public static int inverteNumero(int numero) {
    
    int aux = 0;

    do {
      aux *= 10;
      aux = aux + (numero % 10);
      numero /= 10;
      
    } while (numero > 0);

    return aux;
  }
}