import java.util.*;

class Sort012{

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      sort(arr);
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    }

  static int[] sort(int arr[]) {
    int start = 0, mid = 0, end = arr.length - 1, c = 0;
    for (int i = 0; i <= end; i++) {
      if (arr[i] == 0) {
        c = arr[start];
        arr[start] = arr[i];
        arr[i] = c;
        start++;

      } else if (arr[i] == 2) {
        c = arr[end];
        arr[end] = arr[i];
        arr[i] = c;
        end--;
        i--;
      }

    }
    return arr;
  }
}