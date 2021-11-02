package Week2;

public class PageCount {
  public static void main(String[] args) {
    int numberOfPages = 5;
    int pageToTurnTo = 3;
    int result = pageCount(numberOfPages, pageToTurnTo);
    System.out.println(result);
  }
  public static int pageCount(int numberOfPages, int pageToTurnTo){
    int totalPageCount = numberOfPages / 2;
    int pageCountFromFront = pageToTurnTo / 2;
    int pageCountFromBack = totalPageCount - pageCountFromFront;
    return Math.min(pageCountFromFront, pageCountFromBack);
  }  
}
