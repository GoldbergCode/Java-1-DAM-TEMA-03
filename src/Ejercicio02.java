import java.util.Scanner;
public class Ejercicio02 {

  public static void main(String[] args) {
    final int TOTALEXAMENES = 30;
    int calificaciones[] = new int[30];
    Scanner sc = new Scanner(System.in);
    int contadorIguales = 0;
    
    // GENERACIÓN DE NOTAS
    for (int i = 0; i < TOTALEXAMENES; i++) {
      calificaciones[i] = (int) (Math.random() * 11);
   
   //  SOLO PARA VERIFICAR SI FUNCIONA BIEN
   //System.out.println(calificaciones[i]);
      
    }
    // SOLICITUD USUARIO DE CANTIDAD DE NOTAS
    System.out.println("Introduzca la nota de la que desea conocer sus coincidencias.");
    int notaParaConsultar = Integer.parseInt(sc.next());
    
    // CONTANDO LAS COINCIDENCIAS DE LA NOTA INTRODUCIDA
    for (int i = 0; i < TOTALEXAMENES; i++) {
      if (notaParaConsultar == calificaciones[i]) {
        contadorIguales++;
      }
    }
    // SE DEVUELVE LA RESPUESTA TRAS EL CÁLCULO
    System.out.println("El número de alumnos con la nota que ha introducido es: "
        + contadorIguales);
  }
}
