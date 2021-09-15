package Week1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        long maxtotal = Long.MIN_VALUE;
        long mintotal = Long.MAX_VALUE;
        
        for(int i =0; i< arr.size(); i++){
            total+=arr.get(i);
        }
        for(int i = 0; i< arr.size(); i++){
            long newsum = total - arr.get(i);
            maxtotal = Math.max(maxtotal, newsum);
            mintotal = Math.min(mintotal, newsum);
        }
        System.out.print(mintotal+ " "+ maxtotal);
    }  
}

public class MiniMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
