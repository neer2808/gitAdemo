
// definition class
public class Second {
  // encapsulation
  // encapsulation = datahiding + abstraction
  private int num1;
  private int num2;

  public int getNum1() {
    return num1;
  }
  Second()
  {
    java.util.Scanner s = new java.util.Scanner(System.in);
    num1 = s.nextInt();
    num2 = s.nextInt();
  }
//  public void setNum1(int num1) {
//    this.num1 = num1;
//  }

  public int getNum2() {
    return num2;
  }

//  public void setNum2(int num2) {
//    this.num2 = num2;
//  }
}


// execution class
class SecondMain
{
  public static void main(String[] args) {
    Second obj = new Second();
//    obj.setNum1(78);
//    obj.setNum2(90);
    System.out.println(obj.getNum1() + obj.getNum2());

  }
}
