import java.util.Scanner;
public class Ejercicio05 {

  public static void main(String[] args) {
    int[] meses = new int[12];
    int restanteDias = 0;
    final int ANIOACTUAL = 2022;
    
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
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca una fecha para calcular lo que queda de año.");
    System.out.println("Primero, introduzca el número del día.");
    int dia = Integer.parseInt(sc.next());
    System.out.println("Segundo, introduzca el número de mes.");
    int mes = Integer.parseInt(sc.next());
    System.out.println("Por último, introduzca el año.");
    int anio = Integer.parseInt(sc.next());
    
    // AÑO INTRODUCIDO
    
    if (anio % 4 == 0) {
      meses[1] = 29;
    } else {
      meses[1] = 28;
    }
    restanteDias =  meses[mes - 1] - dia;
    
    for (; mes < meses.length; mes++) {
      restanteDias += meses[mes];
    }
    anio++;
    if (mes == 12) {
      mes = 1;
    }
    for (;anio <= ANIOACTUAL;anio++) {
      
      if (anio % 4 == 0) {
        meses[1] = 29;
      } else {
        meses[1] = 28;
      }
      for (; mes < meses.length; mes++) {
      restanteDias += meses[mes - 1];
      }
      if (mes == 12) {
        mes = 1;
      } else {
        mes++;
      }
    }
    System.out.println("Quedan " + restanteDias);
  }

}
