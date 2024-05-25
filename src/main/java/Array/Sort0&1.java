import java.util.*;

class Sort0and1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sort(a, n);
  }

  public static void sort(int[] a, int n) {
    int st = 0;
    int e = n - 1;
    int temp = 0;
    while (st < e) {
      if (a[st] == 0) {
        st++;

      } else {
        temp = a[st];
        a[st] = a[e];
        a[e] = temp;
        e--;
      }
      if (a[e] == 1) {
        e--;
      } else {
        temp = a[st];
        a[st] = a[e];
        a[e] = temp;
        st++;
      }

    }
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}