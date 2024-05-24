class Fancy_pattern2{
  public static void main(String[] args){
    int n=4;
    int star=1;
    int s=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=star;j++){
        if(j%2!=0){
        System.out.print(s+" ");
        s++;
        }
        else{
          System.out.print("*"+" ");
        }
      }
      System.out.println();
      star+=2;
      
    }
    int s1=s-n;
    for(int i=0;i<n;i++){
      int k=s1;
      for(int j=0;j<=n-i-1;j++){
          System.out.print(k+" ");
          k++;
        if(j<n-i-1){
          System.out.print("*"+" ");
        }
          
       }
      System.out.println();
      s1=s1-(n-i-1);
        
      }
      
    }
      
    }
  
