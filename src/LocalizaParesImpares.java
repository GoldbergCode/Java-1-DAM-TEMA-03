
public class LocalizaParesImpares {

  public static void main(String[] args) {
    System.out.println("EXAMEN DE Sergio José Vertedor Beltrán. LOCALIZA PARES / IMPARES");
    int[] numeros = new int[50];
      
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 100) + 1);
       
      System.out.print(numeros[i] + " ");
    }
    System.out.println("\nELEMENTOS PARES EN POSICIONES PARES");
    for (int i = 0; i < numeros.length; i++) {
      if (i % 2 == 0) {
        if (numeros[i] % 2 == 0) {
           
          System.out.print("[" + i + "]=" + numeros[i]);
        }
      }
    }
  
    System.out.println("\nELEMENTOS IMPARES EN POSICIONES IMPARES");
    for (int i = 0; i < numeros.length; i++) {
      if (i % 2 != 0) {
        if (numeros[i] % 2 != 0) {
           
          System.out.print("[" + i + "]=" + numeros[i]);
        }
      }
    }
    
  }

}
