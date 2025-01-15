import java.util.Scanner;

public class Fibonacciseries {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int b = sc.nextInt();

    for (int i = 1; i <= 9; i++) {
      int nextterm = a + b;
      System.out.println(nextterm);
      a = b;
      b = nextterm;
    }
  }
}