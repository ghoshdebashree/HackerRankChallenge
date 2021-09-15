package Week1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int countN = 0;
        int countP = 0;
        int countZ = 0;
        for( int i =0; i< arr.size(); i++){
            if(arr.get(i) < 0){
                countN++;
            }
            else if(arr.get(i) > 0){
                countP++;
            }
            else{
                countZ++;
            }
        }
        float divN = (float)countN/arr.size();
        float divP = (float)countP/arr.size();
        float divZ = (float)countZ/arr.size();
        System.out.println(String.format("%.6f", divP));
        System.out.println(String.format("%.6f", divN));
        System.out.println(String.format("%.6f", divZ));
        
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
