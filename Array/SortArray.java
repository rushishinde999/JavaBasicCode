package Array;

import java.util.Arrays;

public class SortArray {

  public static void main(String[] args) {

    int[] ar = { 2, 5, 6, 4, 7, 8, 9, 10, 3, 1, };

    for (int i = 0; i < ar.length - 1; i++) {
      for (int j = i + 1; j < ar.length; j++) {
        if (ar[i] > ar[j]) {
          int temp = ar[i];
          ar[i] = ar[j];
          ar[j] = temp;
        }
      }
    }
    int max = ar[ar.length - 1];
    int secondmax = ar[ar.length - 2];

    System.out.println(Arrays.toString(ar));
    System.out.println(max);
    System.out.println(secondmax);

  }
}
