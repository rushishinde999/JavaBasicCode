import java.util.Scanner;

public class sumofdigit {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int sum = 0;
    int rev = 0;

    while (no != 0) {
      int digit = no % 10;

      no = no / 10;

      rev = rev * 10 + digit;
      sum = sum + digit;

    }
    System.out.println("reverse number is " + rev);
    System.out.println("sum of digit is " + sum);

  }
}
