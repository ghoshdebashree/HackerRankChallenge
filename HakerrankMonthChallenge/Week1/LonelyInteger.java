package Week1;

import java.util.*;

public class LonelyInteger {
  public static int lonelyinteger(List<Integer> a) {
    int result = 0;
    for(int i =0 ; i< a.size(); i++){
        result = result ^ a.get(i);
    }
    return result;
   }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
          a.add(1);
          a.add(2);
          a.add(3);
          a.add(4);
          a.add(3);
          a.add(2);
          a.add(1);
          int result = lonelyinteger(a);
          System.out.println(result);
    }
}
