public class NumeroPar {
  
  public static void main(String args[]) {

    int numero = 4;

    if (numero > 0) {

      if (numero % 2 == 0) {
        
        System.out.println("El número introducido es PAR");

      } else {
        
        System.out.println("El número introducido es IMPAR");
      }

    } else {

      System.out.println("Introduce algún número positivo");

    }

  }

}