import java.util.*;
class Printextreme{
  public static void main(String[] args){
    int [] a = {1,2,3,4,5,6,7,8,9};
    int s = a.length;
    print(a,s);
  }
  public static void print(int [] a,int s){
    int st = 0;
    int end = s-1;
    for(int i=0;i<s/2+1;i++){
      if(st==end){
        System.out.print(a[st]+" ");
      }
      else{
        System.out.print(a[st]+" ");
        System.out.print(a[end]+" ");
       
      }
       st++;end--;
    }
  }
}