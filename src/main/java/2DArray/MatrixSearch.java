class MatrixSearch{
  public static void main(String[] args){
    int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int target = 55;
    int n = arr.length;
    int m = arr[0].length;
    int c = 0;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(arr[i][j]==target){
         c=1;
          break;
        }

      }
    }
    if(c==1){
    System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}