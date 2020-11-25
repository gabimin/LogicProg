public class Logicos {

  public static void main(String args[]) {

    boolean v = true;
    boolean f = false;

    System.out.println("v && f = " + (v&&f));
    //false

    System.out.println("v || f = " + (v||f));
    //true

    System.out.println("!(v && f) = " + !(v&&f));
    //true

  }
}