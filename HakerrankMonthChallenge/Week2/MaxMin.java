package Week2;

import java.util.List;


public class MaxMin {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 4, 2, 7, 10, 4);
    int n = 3;
    int value = checkMaxMin(list, n);
    System.out.println(value);
  }
  public static int checkMaxMin(List<Integer> list, int n){
    int lowestGap = Integer.MAX_VALUE;
    int startWindow = 0;            //sliding window approach
    for(int endWindow = 0; endWindow< list.size(); endWindow++){
      if(endWindow >= n -1){
        lowestGap = Math.min(lowestGap , (list.get(endWindow) - list.get(startWindow)));
      }
    }
  return lowestGap;  
  }
}
