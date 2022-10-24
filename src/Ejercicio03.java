import java.util.Scanner;
public class Ejercicio03 {

  public static void main(String[] args) {
    int numeros[] = new int[15];
    final int MAXIMONUMEROS = 15;
    int numeroMayor = 0;
    int numeroMenor = 500;
    int vecesMayor = 0;
    int vecesMenor = 0;
    
    // RELLENAMOS ARRAY CON RANDOM
    for (int i = 0; i < MAXIMONUMEROS; i++) {
      numeros[i] = (int) (Math.random() * 500 + 1);
     
      // VER CONTENIDO ARRAY
      // System.out.println(numeros[i]);
      
      // NÚMERO MAYOR  
      if (numeros[i] > numeroMayor) {
        numeroMayor = numeros[i];
      }
      // NÚMERO MENOR  
      if (numeros[i] < numeroMenor) {
        numeroMenor = numeros[i];
      }
    }
    // CONTADOR DE VECES QUE APARECEN NÚMERO MAYOR Y NÚMERO MENOR
    for (int i = 0; i < MAXIMONUMEROS; i++) {
      if (numeroMayor == numeros[i]) {
        vecesMayor++;
      }
      if (numeroMenor == numeros[i]) {
        vecesMenor++;
      }
    }
    System.out.println("El número mayor es: " + numeroMayor);
    System.out.println("y las veces que se ha repetido es: " + vecesMayor);
    System.out.println("El número mayor es: " + numeroMenor);
    System.out.println("y las veces que se ha repetido es: " + vecesMenor);
  }
}
