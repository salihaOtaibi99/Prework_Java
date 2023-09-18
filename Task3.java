import java.util.Scanner;

class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter the number:  ");
    num = sc.nextInt();

    checkOddEven(num);
  }

  public static void checkOddEven(int num) {

    if (num % 2 == 0) {
      System.out.println("EVEN Number");
    } else {
      System.out.println("ODD Number");
    }
  }

}