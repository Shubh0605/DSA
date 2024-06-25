import java.util.*;
class Common3arrayelement {
    public static void main(String[] args) {
      int [] A = {1, 5, 10, 20, 40, 80};
      int [] B = {6, 7, 20, 80, 100};
      int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
      int n1 = 6;
      int n2 = 5;
      int n3 = 8;
      int d [] = {};
     ArrayList<Integer> ans = new ArrayList<>();
     Set<Integer> st = new TreeSet<Integer>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2 && k < n3){
            if(A[i] == B[j ] && B[j] == C[k]){
                //ans.add(A[i]);
                st.add(A[i]);
                i++;j++;k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        for(int m : st){
            ans.add(m);
        }
        for(int l : ans){
          System.out.print(ans+" ");
        }


    }
}
