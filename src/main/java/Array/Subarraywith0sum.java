import java.util.*;

class Subarraywith0sum {
  public static void main(String[] args) {
    int[] arr = { 4, 2, -3, 1, 6 };
    int n = arr.length;
    HashMap<Integer, Boolean> test = new HashMap<>();
    int sum = 0;
    int c = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];

      if (sum == 0 || test.containsKey(sum) && test.get(sum) == true) {
        c = 1;
      }
      test.put(sum, true);
    }
    if (c == 1) {
      System.out.print("true");
    } else {
      System.out.print("false");
    }
  }
}