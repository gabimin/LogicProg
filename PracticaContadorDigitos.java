public class PracticaContadorDigitos {

  public static void main(String[] args) {

    int num = 150;

    if (num > 0) {
      
      if (num < 10) {
        System.out.println("El número tiene 1 dígito");
      }

      if (num >= 10 && num <= 99) {
        System.out.println("El número tiene 2 dígitos");
      }

      if (num >= 100 && num <= 999) {
        System.out.println("El número tiene 3 dígitos");
      }

      if (num >= 1000 && num <= 9999) {
        System.out.println("El número tiene 4 dígitos");
      }
    
  } else {
    System.out.println("Introduce un número positivo entre 1 y 9999");
  }

  }

}