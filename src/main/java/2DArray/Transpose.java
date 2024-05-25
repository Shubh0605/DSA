import java.util.*;
class Transpose{
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
    transpose(a,n,m);
  }
  public static void transpose(int[][] a,int n,int m){
    int[][] temp = new int[n][m] ;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        temp[j][i] = a[i][j];
      }
    }
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          {
            System.out.print(temp[i][j]+" ");
          }
        System.out.println();
      }
  }
}