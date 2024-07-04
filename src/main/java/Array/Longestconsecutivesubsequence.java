class Longestconsecutivesubsequence{
  public static void main(String[] args){
    int a [] = {2,6,1,9,4,5,3};
    Arrays.sort(a);
    int c = 0;
    int ls = Integer.MIN_VALUE;
    int l = 1;
    for(int i=0;i<a.length;i++){
      if(a[i] == ls+1){
        c++;
        ls = a[i];
      }
      else if(a[i] != ls){
        c = 1;
        ls = a[i];
      }
      l = Math.max(l,c);

    }
    System.out.print(l);
  }
}