import java.util.*;

class Factorialsoflargenumbers {
  public static void main(String[] args) {
    int n = 7;
    ArrayList<Integer> ans = new ArrayList<>();
    int c = 0;

    ans.add(1); 

    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < ans.size(); j++) {
        // Calculate the new value
        int newValue = ans.get(j) * i + c;
        // Update the element in the ArrayList
        ans.set(j, newValue % 10); 
        c = newValue / 10;
      }
      while (c > 0) {
        ans.add(c%10);
        c /= 10;
      }
     
    }
    Collections.reverse(ans);

    System.out.println(ans); 
  }
}
