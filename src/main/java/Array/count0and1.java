import java.util.*;
class count0and1{
  public static void main(String[] args){
    int [] a = {1,1,0,0,0,0,1,0,1,1,1,1,0,1,};
    int size = a.length;
    count(a,size);
  }
  public static void count(int [] a,int size){
    int zero=0;
    int one=0;
    for(int i=0;i<size;i++){
      if(a[i]==0){
        zero++;
      }
      if(a[i]==1){
        one++;
      }
    }
    System.out.print(zero+" "+one);
  }
}