package Week2;

public class SmallestSubArraySum {
  public static void main(String[] args) {
    int[] arr = {2, 1, 5, 2, 8};
    int sum = 7;
    int result = checkSum(arr, sum);
    System.out.println(result);
  }
  public static int checkSum(int[] arr, int sum){
    int windowSum = 0, minLength = Integer.MAX_VALUE;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd]; // add the next element
      // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
      while (windowSum >= sum) {
        minLength = Math.min(minLength, windowEnd - windowStart + 1);
        windowSum -= arr[windowStart]; // subtract the element going out
        windowStart++; // slide the window ahead
      }
    }

    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }
  
}
