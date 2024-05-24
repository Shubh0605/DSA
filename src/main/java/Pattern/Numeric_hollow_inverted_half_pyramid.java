class Numeric_hollow_inverted_half_pyramid{
  public static void main(String[] args){
    for(int i=1;i<=5;i++){
      for(int j=i;j<=5;j++){
        if(i==1 || i==j || i==5||j==5){
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