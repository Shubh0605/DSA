class Minimumnumberofjumps{
  public static void main(String[] args){
    int [] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    int max =0;
    int maxr = 0;
    int jump = 0;
    for(int i=0;i<n;i++){
        if(n==1){
            return 0;
        }
        max=Math.max(max,i+arr[i]);
        if(maxr==i){
            maxr=max;
            jump++;
            if(maxr >= n-1){
                return jump;
            }
        }
    }
    return -1;
    
  }
}