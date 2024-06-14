class KadanesAlgorithm{
  public static void  main(String[] args){
    int [] a = {-2,1,-3,4,-1,2,1,-5,4};
    int sum = 0;
    int m = a[0];
    for(int i=0;i<a.length;i++){
      sum += a[i];

      m = Math.max(m,sum);
      if(sum<0){
        sum = 0;
      }
    }
    System.out.print(m);
  }
}