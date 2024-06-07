import java.util.*;
class findduplicate{
  public static void main(String[] args){
    int [] a = {1,3,4,2,2};
    int temp = 0;
    while(a[0] != a[a[0]]){
      temp = a[a[0]];
      a[a[0]] = a[0];
      a[0] = temp;
      // swap(a[0],a[a[0]]);
    }
    System.out.print(a[0]);
  }
}