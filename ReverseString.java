import java.util.Scanner;

public class ReverseString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    String reversestring = "";

    for (int i = word.length() - 1; i >= 0; i--) {
      reversestring = reversestring + word.charAt(i);
    }
    System.out.println(reversestring);
  }
}