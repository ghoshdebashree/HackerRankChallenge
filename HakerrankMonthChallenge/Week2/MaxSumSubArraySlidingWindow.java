package Week2;

public class MaxSumSubArraySlidingWindow {
  public static void main(String[] args) {
    int[] arr = {1 ,2 ,4 ,7 ,1 ,8 , 11, 2, 8, 0};
    int windowSize = 3;
    int result = checkMaxSum(arr, windowSize);
    System.out.println("Max Sum Sub Array is " + result);
  }
  public static int checkMaxSum(int[] arr, int windowSize){
    int windowStart = 0;
    int windowSum = 0;
    int maxSum = 0;
    for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
      windowSum += arr[windowEnd];
      if(windowEnd >= windowSize - 1){
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= arr[windowStart];
        windowStart++;   
      }
    }
    return maxSum;
  }
  
}
