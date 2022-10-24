import java.util.Scanner;
public class EjercicioExtra02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("***** ADIVINA EL NÚMERO *****");
    int numero = 0;
    int numeroParaAcierto = (int) (Math.random() * 100 + 1);
    boolean haAcertado = false;
    final int NUMEROINTENTOS = 10;
   
    for (int i = 1; (i <= NUMEROINTENTOS) && (haAcertado == false); i++) {
     
      if (i == 1) {
        System.out.println("Introduce un número del 1 al 100");
      } else {
        System.out.println("¡Vuelve a intentarlo!");
      }
      numero = Integer.parseInt(sc.next());
      if (numero == numeroParaAcierto) {
        haAcertado = true;
        System.out.println("¡Has acertado!");
      }
      if (numero < numeroParaAcierto) {
        System.out.println("El número introducido es menor. Te quedan " 
            + (NUMEROINTENTOS - i) + " intentos.");
      }
      if (numero > numeroParaAcierto) {
        System.out.println("El número introducido es mayor. Te quedan " 
            + (NUMEROINTENTOS - i) + " intentos.");
      }    
      if (i == NUMEROINTENTOS) {
        System.out.println("¡Te has quedado sin intentos!");
        System.out.println("Fin del programa.");
    }
   }
  }

}
