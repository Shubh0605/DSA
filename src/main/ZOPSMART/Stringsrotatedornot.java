class Stringsrotatedornot{
  public static void main(String[] args){
    String str1 = "IndiaVsSouthAfrica";
    String str2 = "VsSouthAfricaIndia";
    if(check(str1,str2)){
      System.out.println("Y");
    }
    else{
      System.out.println("N");
    }
  }
  public static boolean check(String str1,String str2){
    if(str1.length()!=str2.length()){
      return false;
    }
    String con = str1+str1;
    return con.contains(str2);
  }
}