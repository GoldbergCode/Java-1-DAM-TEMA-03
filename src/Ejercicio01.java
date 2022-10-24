import java.util.Scanner;
public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca 8 números reales para realizar diferentes cálculos.");
    final int TOTALNUMEROS = 8;
    double sumaNumeros = 0;
    double sumaMayores36 = 0;
    double cantidadMayores50 = 0;
    int k = 0;
    double sumatorioParaMedia = 0;
    double media = 0;
    
    for (int i = 0; i < TOTALNUMEROS; i++) {
      System.out.println("Escriba el #" + (i + 1));
      double[] numeros = new double[8];
      numeros[i] = Double.parseDouble(sc.next());
     
      // SUMA
      sumaNumeros = (sumaNumeros + numeros[i]);
      // SUMA DEL VECTOR MAYORES A 36
      if (numeros[i] > 36) {
        sumaMayores36 = (sumaMayores36 + numeros[i]);
     }
      // CANTIDAD DE VALORES MAYORES A 50
      if (numeros[i] > 50) {
        cantidadMayores50 = cantidadMayores50 + 1;
     }
      // MEDIA DE LOS VALORES ENTRE 10 Y 30
      if (numeros[i] >= 10 && numeros[i] <= 30) {
        k ++;
        sumatorioParaMedia = sumatorioParaMedia + numeros[i];
        media = sumatorioParaMedia / k;
     }
     
    }
    System.out.println("La suma de todos los elementos es igual a: " + sumaNumeros);
    System.out.println("La suma de todos los elementos mayores a 36 es igual a: " + sumaMayores36);
    System.out.println("La cantidad de valores mayores de 50 es: " + cantidadMayores50);
    System.out.println("La media de valores entre 10 y 30 es: " + media);
  }

}
