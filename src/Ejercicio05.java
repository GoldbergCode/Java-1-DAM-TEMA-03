import java.util.Scanner;
public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int ANIOACTUAL = 2022;
    int diasRestantes = 0;
    int[] meses = new int[12];
    boolean isReset = false;
    
    meses[0] = 31;
    meses[1] = 28;
    meses[2] = 31;
    meses[3] = 30;
    meses[4] = 31;
    meses[5] = 30;
    meses[6] = 31;
    meses[7] = 31;
    meses[8] = 30;
    meses[9] = 31;
    meses[10] = 30;
    meses[11] = 31;
    
    System.out.println("Introduzca una fecha para calcular lo que queda de año.");
    System.out.println("Primero, introduzca el número del día.");
    int dia = Integer.parseInt(sc.next());
    System.out.println("Segundo, introduzca el número de mes.");
    int mes = Integer.parseInt(sc.next());
    System.out.println("Por último, introduzca el año.");
    int anio = Integer.parseInt(sc.next());
    
    // RESOLVEMOS PRIMER MES EN CURSO INTRODUCIDO
    if (anio % 4 == 0) {
      meses[1] = 29;
      diasRestantes = ((diasRestantes + meses[(mes - 1)]) - dia);
    } else {
      meses[1] = 28;
      diasRestantes = ((diasRestantes + meses[(mes - 1)]) - dia);
    }
    // FOR HASTA QUE SEA 2023.
    for (; anio <= ANIOACTUAL; anio++) {
      if (isReset == true) {
        mes = 1;
        isReset = false;
      }
      // SI ES BISIESTO
      if (anio % 4 == 0) {
        meses[1] = 29;
        for (; isReset == false; mes++) {
          diasRestantes = (diasRestantes + meses[(mes - 1)]); 
          if (mes == 11) {
            isReset = true;
          }
        }
        // SI NO ES BISIESTO
      } else {
        meses[1] = 28;
        for (; isReset == false; mes++) {
          diasRestantes = (diasRestantes + meses[(mes - 1)]); 
          if (mes == 11) {
            isReset = true;
          }
        }
      }
    }
    System.out.println("Quedan " + diasRestantes + " días hasta el final del año " + ANIOACTUAL);
    
  }
}
