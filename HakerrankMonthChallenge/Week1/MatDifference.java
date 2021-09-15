
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public class MatDifference{

  public static int diagonalDifference(List<List<Integer>> list) {
      int sumL = 0;
      int sumR = 0;
      int difference = 0;

      // i = 0 to n, j = 0 to n
      int i = 0;
      int j = 0;
      while (i < list.size() && j < list.get(0).size()) {
        sumL += list.get(i).get(j);
        i++;
        j++;
      }

      // i = 0 to n, j = n to 0
      i = 0;
      j = list.get(0).size() - 1;
      while(i < list.size() && j >= 0) {
        sumR += list.get(i).get(j);
        i++;
        j--;
      }
      difference = Math.abs(sumL - sumR);
      return difference;
  }
  public static void main(String[] args) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    list1.add(11);
    list1.add(2);
    list1.add(4);
    list.add(list1);
    list2.add(4);
    list2.add(5);
    list2.add(6);
    list.add(list2);
    list3.add(10);
    list3.add(8);
    list3.add(12);
    list.add(list3);
    int difference = diagonalDifference(list);
    System.out.println(difference);

  }
}

/**
 * 11, 2, 4
 * 4, 5, 6
 * 10, 8, 12
 */