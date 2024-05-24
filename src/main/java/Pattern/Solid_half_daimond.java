class Solid_half_daimond{
  public static void main(String[] args){
    int n = 5;
    
    for(int i=1;i<=2*n-1;i++){
      int c = 1;
      if(i<=n){
        c=i;
      }
      else{
        c=2*n-i;
      }
      for(int j=1;j<=c;j++){
        System.out.print("*"+" ");
      }
      c++;
      System.out.println();
    }
  }
}