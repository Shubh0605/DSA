import java.util.*;
class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fact(n);
    
  }
  public static void fact(int n){
    long ans = 1;
    for(int i=1;i<=n;i++){
       ans = ans * i;
      System.out.print(ans);
    }
  }
}