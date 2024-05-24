class Numeric_palindrome_equilateral_pyramid{
  public static void main(String[] args){
    int n = 5;
    int space = n-1;
    int k=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print("  ");
      }
      int s=0;
      for(int j=1;j<=k;j++){
        if(j<=i){
          s++;
        }
        else{
          s--;
        }
        System.out.print(s+" ");
      }
      System.out.println();
      k+=2;
      space--;
    }
  }
}
    