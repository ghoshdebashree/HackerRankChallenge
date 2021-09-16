
class Result {

  public static int birthday(List<Integer> s, int d, int m) {
      int sum;
      int ways =0;
      for(int i =0; i<= s.size() - m; i++){
          sum =0;
          for(int j = i; j< i+m; j++){
            sum+=s.get(j);
          }
          if(sum == d){
              ways++;
          }
          
      }
  return ways;
  }
}
public class SubArrayDivision {
  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
          .map(Integer::parseInt)
          .collect(toList());

      String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      int d = Integer.parseInt(firstMultipleInput[0]);

      int m = Integer.parseInt(firstMultipleInput[1]);

      int result = Result.birthday(s, d, m);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
  }
}


