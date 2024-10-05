mport java.util.*;
class MergeIntervals{
  public static void main(String[] args){
    int [] [] a = {{1,3},
      {2,6},
      {8,9},
      {9,11},
      {8,10},
      {2,4},
      {15,18},
      {16,17}};
    Arrays.sort(a,(o1,o1) -> Integers.compare(o1[0],o1[0]));//lamda function to sort 2d array
    for(int i=0;i<a.length;i++){
      
    ArrayList<int []> ans = new ArrayList<>();
    if(ans.isEmpty() || a[i][0] > ans.get(ans.size()-1)[1]){
      ans.add(new int[]{a[i][0],a[i][1]});
    }
    else{
      ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],a[i][1]);
    }
  }
    int [][] result = ans.toArray(new int[ans.size()][]);
    for(int i : result){
      System.out.print(Arrays.toString(i));
    }
  }
}