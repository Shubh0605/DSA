import java.util.*;
class Reverse_integer{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverse(n);
  }
  public static void reverse(int n){
    int ans =0;
    while(n>0)
    {
      int rem = n%10;
      ans = ans*10 + rem;
      n/=10;
    }    
    System.out.println(ans);
  }
}