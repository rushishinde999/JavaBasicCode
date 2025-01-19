package Stream;

import java.util.Arrays;

public class RemoveDuplicate {
  public static void main(String[] args) {

    int a[] = { 4, 2, 2, 3, 45, 1, 1, 51, 5, 5 };
    int unique[] = Arrays.stream(a).distinct().toArray();
    System.out.println(Arrays.toString(unique));

  }

}
