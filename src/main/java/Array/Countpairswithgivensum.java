import java.util.*;
class Countpairswithgivensum{
  public static void main(String[] args){
    int N = 4; 
    int K = 6;
    int arr[] = {1, 5, 7, 1};
    int res = 0;
    HashMap <Integer,Integer> map = new HashMap<>();
    for(int i=0;i<N;i++){
      if(arr[i]>K){
        continue;
      }
      int val = K - arr[i];
      res += map.getOrDefault(val,0);
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    System.out.print(res);

  }
}