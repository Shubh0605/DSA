import java.util.*;
class Print_prime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      boolean is = print_prime(i);
    if(is){
      System.out.println(i);
      
      
    }
    }
  }
  public static boolean print_prime(int n){
    for(int i=2;i<n;i++){
      if(n%i==0){
        return false;
        
      }
    }
    return true;
    }
    
    
  }

