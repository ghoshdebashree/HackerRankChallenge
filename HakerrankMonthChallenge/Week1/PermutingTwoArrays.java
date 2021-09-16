package Week1;
import java.io.*;
import java.util.*;

class Result {
     
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    
     String status = "YES";
     Collections.sort(A);
     Collections.sort(B, Collections.reverseOrder());
     
     for(int i = 0; i< A.size() ; i++ ){
          if(A.get(i) + B.get(i) < k){
                status = "NO";
                break;
          }
        }
    return status;
    }
}

public class PermutingTwoArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            String[] ATemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> A = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(ATemp[i]);
                A.add(AItem);
            }

            String[] BTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> B = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BTemp[i]);
                B.add(BItem);
            }

            String result = Result.twoArrays(k, A, B);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
