
public class Ejercicio09 {

  public static void main(String[] args) {
    
    int[] numeros = new int[50];
    int acumuladorMedia = 0;
    //CARGAMOS ARRAY
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 499) + 301);
      acumuladorMedia += numeros[i];
    }
    
    double mediaNumeros = acumuladorMedia / numeros.length;
    double[] resultadosCalculo = new double[50];
    
    for (int i = 0; i < resultadosCalculo.length; i++) {
      resultadosCalculo[i] = (numeros[i] / mediaNumeros);
      System.out.println(resultadosCalculo[i]);
    }
  }
}
