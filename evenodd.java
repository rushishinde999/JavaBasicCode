import java.util.Scanner;

public class evenodd {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    if (no % 2 == 0) {
      System.out.println("even number");
    } else {
      System.out.println("odd number");
    }
  }
}
