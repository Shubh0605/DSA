import java.util.*;
import java.util.*;
class Sort0125{
  public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      int [] a = new int[n];
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
      int temp = 0;
      int l = 0;
      int h = a.length-1;
      for(int i=0;i<n;i++){
        if(a[i]==0){
        temp = a[l];
        a[l] = a[i];
        a[i] = temp;
        l++;
      }
      else if(a[i]==2){
        temp = a[h];
        a[h] = a[i];
        a[i] = temp;
        h--;
        n--;
        i--;
      }
      }
      for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
      }
  }
}