package Array;

public class printarray {

  public static void main(String[] args) {
    int[] marks = new int[3];
    marks[0] = 99;
    marks[1] = 100;
    marks[2] = 99;

    String sub[] = { "Java", "REact", "mysql" };

    for (int i = 0; i < 3; i++) {
      System.out.println(marks[i]);
    }

    for (String s : sub) {
      System.err.println(s);
    }
  }
}