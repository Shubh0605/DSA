class Maxima{
  public static void main(String[] args){
    int [] a = {5,3,8,7,10};
    ArrayList<Integer> ar = new ArrayList<>();
    int n = a.length;
    if(n>1&&a[0]>a[1]){
      ar.add(a[0]);
    }
    for(int i=1;i<n-1;i++){
      if(a[i] > a[i-1]&&a[i]>a[i+1]){
        ar.add(a[i]);
      }
    }
    if(n>1&&a[n-1]>a[n-2]){
      ar.add(a[n-1]);
    }
    for(int i : ar){
      System.out.print(i+" ");
    }
  }
}
//output 5 8 10
//Print all maxima in the array. maxima is an element at index i, such that array[i]>array[i-1] and array[i]>array[i+1]. for example : input: [5,3,8,7,10] output: {5,8,10}.