import java.util.*;
class MajorityElementII {
  public static void main(String[] args) {
    int[] a = { 3, 2, 3 };
    int n = a.length;
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int i : nums) {
      freq.put(i, freq.getOrDefault(i, 0) + 1);

    }
    int n = nums.length;
    int threshold = n / 3;
    List<Integer> result = new ArrayList<>();
    for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
      if (entry.getValue() > threshold) {
        result.add(entry.getKey());
      }
    }
    for(int i : result){
      System.out.print(i)
    }

  }
}