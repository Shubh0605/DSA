import java.util.*;
class Even_Odd{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(test(n));
  }
  public static boolean test(int n)
   {
  //   if(n%2==0)
     if((n&1)==0){
       return true;
     }
    else{
       return false;
     }
  }
}