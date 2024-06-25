class Besttimetosellstock{
  public static void main(String[] args){
    int [] prices = {7,1,5,3,6,4};
    int n = prices.length;
    int mini = prices[0];
    int maxp = 0;
    for(int i=1;i<n;i++){
      int cost = prices[i]-mini;
      maxp = Math.max(maxp,cost);
      mini = Math.min(mini,prices[i]);
    }
    System.out.print(maxp);
  }
}