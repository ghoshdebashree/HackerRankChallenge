import java.io.*;
class R {

    public static String pangrams(String s) {
        s = s.toLowerCase();
        boolean status =false;
            for(char c = 'a'; c < 'z'; c++){
                if(!s.contains(String.valueOf(c))){
                    status = true;
                    break;
                    
                } 
                    
            }
            if(status) return "not pangram";
            else return "pangram";

        }
    }

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = R.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
