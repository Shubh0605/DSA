class Reverserecursion{
  public static void main(String[] args){
    int [] a = {1,2,3,4,5};
    int n = a.length;
    reverse(a,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }
  public static void reverse(int [] a,int start,int end){
    if(start >= end){
      return;
    }
    else{
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
      reverse(a,start+1,end-1);
    }
  }
}