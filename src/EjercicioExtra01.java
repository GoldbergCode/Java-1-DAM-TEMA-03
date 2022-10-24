
public class EjercicioExtra01 {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int temporalUno = 0;
    int temporalDos = 0;
   
    //CARGAMOS ARRAY
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 30) + 1);
    }
    //ORDENAMOS LO QUE SE VA INTRODUCIENDO
    int j = 0;
    while (j != 50) {
      for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > numeros[i - 1]) {
          temporalUno = numeros[i];
          temporalDos = numeros[i - 1];
          numeros[i] = temporalDos;
          numeros[i - 1] = temporalUno;
        }
      }
      j++;
    }
    // MOSTRAMOS RESULTADO
    for (int i = 1; i < numeros.length; i++) {
      System.out.println(numeros[i]);
   }
  }

}
