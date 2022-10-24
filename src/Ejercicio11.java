import java.util.Scanner;
public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] cromos = new int[100];
    boolean ifExit = false;
    int numeroCromo = 0;
    int entradaCromo = 0;
    int salidaCromo = 0;
    do {
      System.out.println("\n\n(a) Entrada de un cromo nuevo.");
      System.out.println("(b) Consulta un cromo.");
      System.out.println("(c) Lista de cromos repetidos.");
      System.out.println("(d) Lista de cromos pendientes.");
      System.out.println("(e) Cambio de cromos.");
      System.out.println("(f) Salir.");
      char letraOpcion = sc.next().charAt(0);
      //OPCIÓN A
      if (letraOpcion == 'a') {
        System.out.println("Introduzca el número del cromo que va a introducir");
        numeroCromo = Integer.parseInt(sc.next());
        cromos[(numeroCromo - 1)] += 1;
      }
      //OPCIÓN B
      if (letraOpcion == 'b') {
        System.out.println("Introduzca el número del cromo que va a consultar");
        numeroCromo = Integer.parseInt(sc.next());
        if (cromos[(numeroCromo - 1)] == 0) {
          System.out.println("Actualmente, no existen cromos de este número en la colección."); 
        } else {
          System.out.println("Hay " + cromos[(numeroCromo - 1)] + " cromo/s del número " 
              + numeroCromo + " en la colección");
        } 
      }
      //OPCIÓN C
      if (letraOpcion == 'c') {
        for (int i = 0; i < cromos.length; i++) {
          if (cromos[i] > 1) {
            System.out.println("El cromo #" + (i + 1) + " tiene un total de " + cromos[i] 
                + " unidades.");
          }
        }
      }
      //OPCIÓN D
      if (letraOpcion == 'd') {
        System.out.println("Listado de cromos pendientes");
        for (int i = 0; i < cromos.length; i++) {
          if (cromos[i] == 0) {
            System.out.println(" Cromo #" + (i + 1) + " ");
          }
        }
      }
      //OPCIÓN E
      if (letraOpcion == 'e') {
        System.out.println("Intercambio de cromos.");
        System.out.println("¿Qué cromo vas a dar?");
        salidaCromo = Integer.parseInt(sc.next());
        cromos[(salidaCromo - 1)] -= 1;
        System.out.println("¿Qué cromo vas a recibir?");
        entradaCromo = Integer.parseInt(sc.next());
        cromos[(entradaCromo - 1)] += 1;
      }   
      //OPCIÓN F
      if (letraOpcion == 'f') {
        System.out.println("APLICACIÓN DETENIDA.");
        ifExit = true;
      }
    } while (ifExit == false);       
  }
}