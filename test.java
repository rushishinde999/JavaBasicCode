import java.util.Arrays;
import java.util.stream.IntStream;

public class test {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3 };
    int b[] = { 4, 5, 6 };

    for (int n : a) {
      System.out.println(n);
    }

    int merge[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    System.out.println(Arrays.toString(merge));

  }
}