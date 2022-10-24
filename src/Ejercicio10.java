import java.util.Scanner;
public class Ejercicio10 {

  public static void main(String[] args) {
    
    
    // CREAMOS VARIABLES Y ARRAY
    int[] numeros = new int[30];
    int temporalUno = 0;
    int temporalDos = 0;
    boolean isChanged = false;
    
    // CARGAMOS ARRAY
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 21);
      System.out.print(numeros[i] + " ");
    }
    // SOLICITAMOS DOS VALORES
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\nSe requieren dos valores enteros.");
    System.out.print("\n\nIntroduzca primer valor entero: ");
    int primerValor = Integer.parseInt(sc.next());
    System.out.print("\nIntroduzca segundo valor entero: ");
    int segundoValor = Integer.parseInt(sc.next());
    
    
    for (int i = 0; i < numeros.length; i++) {
      // ALMACENAMOS DE MANERA TEMPORAL LOS VALORES PARA EL CAMBIO
      temporalUno = numeros[primerValor];
      temporalDos = numeros[segundoValor];
      
      // REALIZAMOS LOS CAMBIOS
      numeros[primerValor] = temporalDos;
      numeros[segundoValor] = temporalUno;
      
      //ENTRECOMILLAMOS CUANDO APAREZCAN LOS VALORES QUE CONTENIAN LA POSICIÓN SOLICITADA
      for (i = 0; i < numeros.length; i++) {
        if (i == primerValor || i == segundoValor) {
          System.out.print("\"" + numeros[i] + "\" ");
        } else {
          System.out.print(numeros[i] + " ");
        }
      }
    }
  }

}
