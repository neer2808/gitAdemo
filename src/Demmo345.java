public class Demmo345 {
  public static void main(String[] args) {

    System.out.println("inside Main method ");
    Demmo345 obj = new Demmo345();

  }
  {
    System.out.println("instance block 2");
  }
  Demmo345()
  {
    System.out.println("inside constructor ");
  }
  // instance block
  {
    System.out.println("instance block 1");
  }
  // static block
  static
  {
    System.out.println("static block ");
  }


  }

