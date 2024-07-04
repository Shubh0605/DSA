class MaximumProductSubarray {
  public static void main(String[] args){
    int [] a = {6, -3, -10, 0, 2}
      int n = a.length;
    int m = Integer.MIN_VALUE;
    int s = 1;
    int p = 1;
    for(int i=0;i<n;i++){
        if(p == 0){
            p = 1;
        }
        if(s == 0){
            s = 1;
        }
        p *= a[i];
        s *= a[n-i-1]; 

        m =  Math.max(m,Math.max(p,s));
    }

   System.out.print(m);
  }
}