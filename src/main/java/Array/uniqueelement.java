import java.util.*;
import java.util.ArrayList;
class uniqueelement{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList <Integer> arr = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      arr.add(sc.nextInt());
      
    }
    unique(arr);
    
}
  public static void unique(ArrayList <Integer> arr){
    int ans = 0;
    for(int i=0;i<arr.size();i++){
      ans = ans ^ arr.get(i);
    }
    System.out.println(ans);
  }
}