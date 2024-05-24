class Numeric_hollow{
  public static void main(String[] args){
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        if(i==1 ||i==j||i==5 || j==1){
          System.out.print(j+" ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}