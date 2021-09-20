public class Demo78 {
  private int num1;
  private int num2;
// demo comment
  public Demo78(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }
  public void show()
  {
    System.out.println(num1);
    System.out.println(num2);
  }

  public static void main(String[] args) {
    Demo78 obj = new Demo78(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
   obj.show();
  }
}
