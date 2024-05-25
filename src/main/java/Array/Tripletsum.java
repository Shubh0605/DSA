import java.util.*;

class Tripletsum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    sum(a, target,n);

  }

  public static void sum(int[] a, int target,int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (a[i] + a[j] + a[k] == target) {
            System.out.println(a[i] + " " + a[j] + " " + a[k]);
          }
        }
      }
    }
  }
}