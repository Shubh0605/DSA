import java.util.*;
class rowsum{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=sc.nextInt();
      }
    }
    rowsum(a,n,m);
  }
  public static void rowsum(int[][] a,int n,int m){
    int sum=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        sum = sum + a[i][j];
        
      }
      System.out.println(sum);
      sum=0;
    }
    
  }
}