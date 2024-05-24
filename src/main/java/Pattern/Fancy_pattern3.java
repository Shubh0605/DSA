class Fancy_pattern3{
  public static void main(String[] args){
    int n=5;
    int star=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=star;j++){
        if(j<=n/2+1){
        System.out.print(j+" ");
        }
        else{
          System.out.print(j-n/2-1+" ");
        }
      }
      System.out.println();
      if(i<n/2+1){
      star+=2;
      }
      else{
        star-=2;
      }
    }
  }
}