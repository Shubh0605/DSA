import java.util.*;
class Check_prime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(test(n)){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not Prime");
    }
  }
  public static boolean test(int n){
    for(int i=2;i<n; i++){
      if(n%i == 0){
       return false;
      }
      
    }
    return true;
  }
}