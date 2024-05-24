class Fancy_pattern1{
  public static void main(String[] args){
    int n=5;
    int space = 8;
    int star = 1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print("*"+" ");
      }
      for(int j=1;j<=star;j++){
        if(j%2!=0){
        System.out.print(i+" ");
        }
        else{
          System.out.print("*"+" ");
        }
      }
      for(int j=1;j<=space;j++){
        System.out.print("*"+" ");
      }
      
      System.out.println();
      space--;
      star+=2;
    }
  }
}