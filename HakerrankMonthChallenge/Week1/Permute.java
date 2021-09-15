import java.util.List;
import java.util.ArrayList;

public class Permute {
     public static void main(String[] args) {
       List<Integer> A =  new ArrayList<>();
       List<Integer> B =  new ArrayList<>();
       A.add(2);
       A.add(1);
       A.add(3);
       B.add(7);
       B.add(8);
       B.add(9);
       int k = 10;
       String r = twoArrays(k, A, B);
       System.out.println(r);
     }
  public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
  
   String status ="";
   for(int i =0; i< A.size(); i++){
       for(int j =0; j< B.size(); j++){
           if(A.get(i) + B.get(j) >= k){
               status+="YES";
               break;
           }
       }
   }
   if(status == "YES") return "YES";
   else return "NO";

  }

}
