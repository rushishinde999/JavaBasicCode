package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4 };
    int b[] = { 5, 6, 7 };
    int merge[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    System.out.println(Arrays.toString(merge));

    System.out.println(Arrays.toString(a));

  }

}
