import java.util.*;
class Mergetwosortedarraywithoutextraspace{
  public static void main(String[] args){
    long [] arr1 = {1,3,5,7};
    long [] arr2 = {0,2,6,8,9};
    int n = arr1.length;
    int m = arr2.length;
    int left = n-1;
    int right = 0;
    long temp = 0;
    while(left>=0 && right < m){
        if(arr1[left]>arr2[right]){
            temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
            left--;
            right++;
        }
        else{
            break;
        }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<n;i++){
      System.out.print(arr1[i]+" ");
    }
    for(int i=0;i<m;i++){
      System.out.print(arr2[i]+" ");
    }
    }
  }
