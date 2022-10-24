
public class Ejercicio08 {

  public static void main(String[] args) {
    
    int[] numeros = new int[25];
    int incremento = 0;
    
    //CARGAMOS ARRAY
    for (int i = 0; i < numeros.length; i++) {
      incremento += 2;
      numeros[i] = incremento;
    }
    
    //MOSTRAMOS ARRAY
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }
    
  }
}
