import java.util.*;
class Linearsearch{
  public static void main(String[] args){
    int a [] = {1,2,3,4,5,6,7,8,9,10};
    int size = a.length;
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    find(a,size,k);
  }
  public static void find(int [] a,int size,int k){
    int f = 0;
    for(int i=0;i<size;i++){
      if(a[i]==k){
        f=1;
        break;
      }
     
    }
    if(f==1){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
}