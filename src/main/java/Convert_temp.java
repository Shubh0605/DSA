import java.util.*;
class Convert_temp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double f = sc.nextDouble();
    convert(f);
  }

public static void convert(double temp)
  {
  double c = (temp-32)*5/9;
  System.out.println(c);
  }
}