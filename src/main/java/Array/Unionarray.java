import java.util.*;
import java.util.ArrayList;
class Unionarray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int [] a = new int[n];
    int [] b = new int[m];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int i=0;i<m;i++){
      b[i] = sc.nextInt();
    }
    ArrayList<Integer> c = new ArrayList<Integer>();
    union(a,b,c);
  }
  public static void union(int [] a, int [] b, ArrayList<Integer> c){
      for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        if(a[i]==b[j]){
          b[j] = -1;
        }
      }
    }
    for(int i=0;i<a.length;i++){
        if(a[i]!=-1){
      c.add(a[i]);
        }
    }
    for(int i=0;i<b.length;i++){
        if(b[i]!=-1){
      c.add(b[i]);
        }
    }
    Collections.sort(c);
    for(int i:c){
      System.out.print(i+" ");
    }
  }
}