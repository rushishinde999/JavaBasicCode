import java.util.Scanner;

public class reversenumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;
    int sum = 0;
    while (num != 0) {

      int digit = num % 10;
      num = num / 10;

      rev = rev * 10 + digit;
      sum = sum + digit;

    }

    System.out.println(rev + " sum is " + sum);

  }
}