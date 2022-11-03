import java.util.Scanner;
public class SegundoMenor {

  public static void main(String[] args) {
    int cantidadNumeros = 0;
    
    
    System.out.println("EXAMEN DE Sergio José Vertedor Beltrán. SEGUNDO MENOR");
    Scanner sc = new Scanner(System.in);
    
    boolean isExit = false;
    do {
      System.out.print("Introduzca al cantidad de números que desea introducir: ");
      cantidadNumeros = Integer.parseInt(sc.next());
    if (cantidadNumeros == 1) {
      System.out.println("La cantidad no puede ser 1.");
    } else {
      isExit = true;
    }
    } while ( isExit == false);
    int[] numeros = new int[cantidadNumeros];
    int i = 0;
    
    System.out.print("\nIntroduzca el número (" + i + "): ");
    numeros[i] = Integer.parseInt(sc.next());
    int primerMenor;
    primerMenor = numeros[i];
    int segundoMenor;
    segundoMenor = numeros[i];
    
    for (i = 1; i < numeros.length; i++) {
      System.out.print("\nIntroduzca el número (" + i + "): ");
      numeros[i] = Integer.parseInt(sc.next());
      if (primerMenor > numeros[i]) {
        primerMenor = numeros[i];
      }
      if (segundoMenor < numeros[i]) {
        segundoMenor = numeros[i];
      }
    }
    for (i = 0; i < numeros.length; i++) {
      if (numeros[i] != primerMenor) {
        if (numeros[i] < segundoMenor) {
          segundoMenor = numeros[i];
        }
      }
    }
    int j = 0;
    for (i = 0; i < numeros.length; i++) {
      if (primerMenor == numeros[i]) {
        j++;
      }
    }      
    if (j > 1 || primerMenor == segundoMenor) {
      System.out.print("ERROR. El segundo menor no puede ser igual que el primero.");
    } else {
      System.out.print("El número menor de los introducidos es: " + primerMenor);
      System.out.print("\nY el segundo menor es: " + segundoMenor);
    }
    

  }

}
