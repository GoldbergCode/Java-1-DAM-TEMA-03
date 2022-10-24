import java.util.Scanner;
public class DADO {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuántas veces quiere tirar el dado? (MÁXIMO 12 VECES)");
    int repeticiones = Integer.parseInt(sc.next());
    // int[] tiradas = new int[20];
    // int[] tiradas = {2, 3, 4, 5};
    int[] tiradas;
    tiradas = new int[12];
    int tiradaDado = 0;
    
    for (int i = 0;i <= (repeticiones - 1);i++) {
    tiradaDado = (int) (Math.random() * 570 + 121);
    tiradas[i] = tiradaDado;
    System.out.println(tiradas[i]);
    }

    // Math.sqrt(); PARA RAIZ CUADRADA
    // PARA RANDOM ENTRE 5 Y 30 -> 30 - 5 + 1 -> RANDOM * 26 + 5 
    // SE DECLARA 5 Y 30 COMO CONSTANTES -> INICIOINTERVALO Y FININTERVALO
    // TAMAÑO ARRAY
    System.out.println(tiradas.length);
  }
}
