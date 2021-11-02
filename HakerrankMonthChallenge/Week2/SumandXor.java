package Week2;

public class SumandXor {
  public static void main(String[] args) {
    long n = 1111111113456L;
    long result = sumXorCheck(n);
    System.out.println(result);
  }
  public static long sumXorCheck(long n){
    int bit = 0;
    while(n > 0){
      if((n & 1) == 0) bit++;
      n = n >> 1;
    }
    return 1 << bit;
  }
  
}
