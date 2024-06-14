class  MinimizetheHeightsII{
  public static void main(String[] args){
    int [] a = {3, 9, 12, 16, 20};
    int k = 3;
    int n = 5;
    int ans = a[n-1]-a[0];
    int small = a[0]+k;
    int largest = a[n-1]-k;
    for(int i=0;i<n-1;i++){
      int mi = Math.min(a[i+1]-k,small);
      int mx = Math.max(a[i]+k,largest);
      if(mi<0){
        continue;
      }
      ans = Math.min(ans,mx-mi);
    }
    System.out.print(ans);
  }
}