import java.util.*;
class findduplicate{
  public static void main(String[] args){
    int [] nums = {1,3,4,2,2};
    Arrays.sort(nums);
    int ans = 0;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i] == nums[i+1]){
        ans = nums[i];
      }
    }
System.out.print(ans);
  }
}