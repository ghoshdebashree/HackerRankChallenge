public class Flipping{
public static void main(String[] args) {
    int n = 3;
    long result = flippingBits(n);
    System.out.println(result);
}

  public static long flippingBits(long n) {
    long mask = (1L << 32) - 1;
    return n ^ mask; 
  }

}
