import java.util.*;
class Finnmin{
  public static void main(String[] args){
    int [] a = {21,65,34,34,23,98,8,65};
    int s = a.length;
    min(a,s);
  }
  public static void min(int [] a,int s){
    int m = Integer.MAX_VALUE;
    for(int i=0;i<s;i++){
      if(a[i]<m){
        m=a[i];
      }
    }
    System.out.println(m);
  }
}