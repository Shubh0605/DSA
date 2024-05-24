import java.util.*;
class Reversearray{
  public static void main(String[] args){
    int [] a= {1,2,3,4,5,6,7,8,9,10};
    int s = a.length;
    reverse(a,s);
  }
  public static void reverse(int [] a, int s){
    int st = 0;
    int e = s-1;
    int temp = 0;
    while(st<e){
      temp = a[st];
      a[st] = a[e];
      a[e] = temp;
      st++;
      e--;
      
    }
    
    for(int i=0;i<s;i++){
    System.out.print(a[i]+" ");
    }
  }
}