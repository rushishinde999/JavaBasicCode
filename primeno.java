import java.util.Scanner;

public class primeno {

  public static void main(String[] args) {

    boolean isprime = true;
    int no;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    no = sc.nextInt();

    if (no > 1) {
      for (int i = 2; i < no; i++) {
        if (no % i == 0) {
          isprime = false;
          break;
        }
      }
    } else {
      isprime = false;
    }
    if (isprime) {
      System.out.println("prime no");
    } else {
      System.out.println("not a prime number");
    }
  }
}