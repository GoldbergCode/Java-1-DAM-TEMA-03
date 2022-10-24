public class MESES {

  public static void main(String[] args) {
    int mesAleatorio = (int) (Math.random() * 12);
    while (mesAleatorio == 0) {
      mesAleatorio = (int) (Math.random() * 12);
    }
    System.out.println(mesAleatorio);

  }

}
