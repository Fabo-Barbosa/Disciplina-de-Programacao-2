public class UniaoDeListas {

  public static void main(String[] args) {
    int[] l1 = {9,0,4,6};
    int[] l2 = {9,0,8,10};

    int[] uni;

    uni = uniao(l1, l2);

    for (int i = 0; i < uni.length; i++) {
      System.out.println(uni[i]);
    }

  }

  public static int[] uniao(int[] v1, int[] v2) {
    
    int tam = v1.length + v2.length;
    int[] aux = v1;
    int[] res = new int[tam];
    int count = 0;
    int count0 = 0;
    
    for (int i = 0; i < 2; i++) {
      if (i == 1)
        aux = v2;
      for (int j = 0; j < aux.length; j++) {
        if (elementIn(aux[j], res)) {
          if (aux[j] == 0 && count0 == 0) {
            res[count] = aux[j];
            count0++;
            count++;
          }else {
            tam--;
          }
        }else{
          res[count] = aux[j];
          count++;
        }
      }
    }

    int[] novaLista = new int[tam];
    for (int i = 0; i < tam; i++) {
      novaLista[i] = res[i];
    }

    return novaLista;
  }

  public static boolean elementIn(int n, int[] lista) {
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] == n)
        return true;
    }

    return false;
  }
}
