import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number between 1 and 9: ");
        int number = sc.nextInt();
        
        useNestedIf(number);
        useSwitchCase(number);
  
  }

  private static void useNestedIf(int number)
    {
        String numberStr = null;
        if (number == 1) {
            numberStr = "ONE";
        } else if (number == 2) {
            numberStr = "TWO";
        } else if (number == 3) {
            numberStr = "THREE";
        } else if (number == 4) {
            numberStr = "FOUR";
        } else if (number == 5) {
            numberStr = "FIVE";
        } else if (number == 6) {
            numberStr = "SIX";
        } else if (number == 7) {
            numberStr = "SEVEN";
        } else if (number == 8) {
            numberStr = "EIGHT";
        } else if (number == 9) {
            numberStr = "NINE";
        } else {
            numberStr = "OTHER";
        }
        System.out.println("(a) Use a \"nested-if\" statement: " + numberStr);
    }
    
    private static void useSwitchCase(int number)
    {
        String numberStr = null;
        switch (number) {
            case 1:
                numberStr = "ONE";
                break;
            case 2:
                numberStr = "TWO";
                break;
            case 3:
                numberStr = "THREE";
                break;
            case 4:
                numberStr = "FOUR";
                break;
            case 5:
                numberStr = "FIVE";
                break;
            case 6:
                numberStr = "SIX";
                break;
            case 7:
                numberStr = "SEVEN";
                break;
            case 8:
                numberStr = "EIGHT";
                break;
            case 9:
                numberStr = "NINE";
                break;
            default:
            numberStr = "OTHER";
            break;
        }
        System.out.println("(b) Use a \"switch-case\" statement: " + numberStr);
    }
  
}