class Set_kth_bit{
  public static void main(String[] args){
    int n = 10;
    int k = 2;
    int mask = 1<<k;
    int ans = n|mask;
    System.out.println(ans);
  }
}