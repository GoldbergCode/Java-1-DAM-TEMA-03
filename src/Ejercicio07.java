import java.util.Scanner;
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int[] numeros = new int[25];
    int acumuladorNumeros = 0;
    Scanner sc = new Scanner(System.in);
    
    //RELLENAR ARRAY CON RANDOM
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 571 + 120);
      //ACUMULADOR PARA MEDIA
      acumuladorNumeros += numeros[i];
    }
    // INICIALIZAR VARIABLES PARA MAYOR Y MENOR
    int mayorNumero = numeros[0];
    int menorNumero = numeros[0];

    for (int i = 0; i < numeros.length; i++) {
      //PARA NÚMERO MENOR
      if (mayorNumero < numeros[i]) {
        mayorNumero = numeros[i];
      }
      //PARA NÚMERO MAYOR  
      if (menorNumero > numeros[i]) {
        menorNumero = numeros[i];
      }
       }
    System.out.println("El mayor de los elementos es: " + mayorNumero);
    System.out.println("El menor de los elementos es: " + menorNumero);
    System.out.println("La media de los elementos es: " + (acumuladorNumeros / numeros.length));
    
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(sc.next());
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == numero) {
        System.out.println("El número " + numero + " aparece en la posición " + i);
      }
    }
  }
}
