import java.util.Scanner;
public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] repeticiones = new int[11];
    int nota;
    
    do {
      System.out.println("Introduzca calificaciones entre 0 y 10.");
      nota = Integer.parseInt(sc.next());
      if (nota >= 0 && nota <= 10) {
        repeticiones[(nota)]++;
      }
    } while (nota >= 0);
    for (int i = 0; i <= 10; i++) {
      if (repeticiones[i] > 0) {
        System.out.println("Numero de veces que aparece " + i + " es: " + repeticiones[i]);
      }
    }
  } 
}
