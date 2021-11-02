package Week2;

import java.util.List;

public class SherlockArray {
  public static void main(String[] args) {
    List<Integer> arr = List.of(1, 2, 3, 6, 6, 0);
    boolean result = checkElement(arr);
    System.out.println(result);
  }
  public static boolean checkElement(List<Integer> arr){
    int sum = 0;
    for(int i = 1; i< arr.size(); i++){
      sum += arr.get(i);
    }
    int leftSum = 0;
    int rightSum = sum;
    if(sum == 0) return true;
    for(int i = 0; i< arr.size() - 1; i++){
      leftSum += arr.get(i);
      rightSum -= arr.get(i + 1);
      if(leftSum == rightSum) return true;    //check left sum of the element is equal to the right sum of the element
    }
    return false;
  }
  
}
