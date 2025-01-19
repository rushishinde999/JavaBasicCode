package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3 };
    int b[] = { 4, 5, 6 };
    int merge[] = new int[a.length + b.length];

    int merged[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    System.out.println(Arrays.toString(merged));

    for (int i = 0; i < a.length; i++) {
      merge[i] = a[i];

    }

    for (int i = 0; i < b.length; i++) {
      merge[i + a.length] = b[i];
    }

    System.out.println("merged array is : ");
    for (int i = 0; i < merge.length; i++) {
      System.out.print(merge[i] + " ");
    }
  }
}
