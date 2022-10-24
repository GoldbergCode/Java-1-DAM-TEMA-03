import java.util.Scanner;
public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] numeros = new long[30];
    final int elementosArray = 30;
    int i = 0;
    
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(sc.next());
   
    numeros[0] = numero;

    
    for (i++ ; i < elementosArray; i++) {
      numero = (numero + 1)* 2;
      numeros[i] = numero;

    }
    for(i--; i >= 0; i--) {
      System.out.println(numeros[i]);
    }
  }
}
