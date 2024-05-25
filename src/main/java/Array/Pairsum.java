import java.util.*;

class Pairsum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    sum(a, b, target);
  }

  public static void sum(int[] a, int[] b, int target) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] + b[j] == target) {
          System.out.println("(" + a[i] + "," + b[j] + ")");
        }
      }
    }
  }
}