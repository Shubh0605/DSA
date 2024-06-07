import java.util.*;
class Missingelementwithduplicate{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      int index = Math.abs(a[i]);
      if(a[index - 1] > 0){
        a[index - 1] *= -1;
      }

    }
    for (int i=0;i<n ;i++){
      if(a[i] > 0){
      System.out.print(i+1+" ");
    } 
    } 
  }
}