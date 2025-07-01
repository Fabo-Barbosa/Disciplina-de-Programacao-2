
public class ProdutoLista {

  public static void main(String[] args) {

    System.out.println(product(1, 3, 4));
    System.out.println(product(5, 5, 5));
    System.out.println(product(1, 0, 4));
    System.out.println(product());
  }
  

  public static int product(int... lista) {
    
    if (lista.length == 0) {
      return 0;
    }

    int produto = 1;

    for (int numero : lista) {
      produto *= numero;
    }

    return produto;
  }
}
