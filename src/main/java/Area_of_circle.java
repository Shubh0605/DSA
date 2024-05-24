import java.util.*;
class Area_of_circle{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    double r = sc.nextDouble();
    System.out.println(area(r));
    
  }
  public static double area(double r){
    return 3.14*r*r;
  }
}