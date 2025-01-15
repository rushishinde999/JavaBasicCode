import java.util.Scanner;

public class palidronenumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int original = no;
    int rev = 0;
    while (no != 0) {
      int digit = no % 10;
      no = no / 10;
      rev = rev * 10 + digit;

    }

    if (original == rev) {
      System.out.println("number is paildrone");
    } else {
      System.out.println("not a palidrone number");
    }

  }
}
