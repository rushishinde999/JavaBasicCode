package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 3, 3, 4, 5, 6, 4, 5, 5, 4, 1, 2 };
    Set<Integer> UniqueNo = new HashSet<>();

    for (int number : a) {
      UniqueNo.add(number);
    }

    int result[] = new int[UniqueNo.size()];
    int index = 0;

    for (int no : UniqueNo) {
      result[index++] = no;
    }

    for (

    int i : result) {
      System.out.print(i + " ");
    }
  }
}