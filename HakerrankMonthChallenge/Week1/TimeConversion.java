package Week1;

import java.io.*;

class Result {

    public static String timeConversion(String s) {
       String[] str = s.split(":") ;
       int n = str.length;
       for(int i =0; i< str.length; i++){
           System.out.print(str[i]);
       }
       String strlast = str[n-1];
       int first = Integer.parseInt(str[0]);
       if(strlast.contains("P") && first !=12){
           first = 12 + first; 
       }
       else if(strlast.contains("A") && first == 12){
           first = 0;
       }
       else{
            return s.substring(0,s.length() - 2);
        }
            if(first != 0) {
                    str[0] = Integer.toString(first);
                    StringBuffer sb = new StringBuffer();
                    for(int i = 0; i < str.length; i++) {
                    sb.append(str[i]+":");
                    }
                    String stg = sb.toString();
                    return stg.substring(0,stg.length() -3);
            }
            else{
                    str[0] = Integer.toString(first);
                    StringBuffer sb = new StringBuffer();
                    for(int i = 0; i < str.length; i++) {
                    sb.append(str[i]+":");
                    }
                    String stg = sb.toString();
                    return "0" +stg.substring(0,stg.length() -3);
            } 
    }   
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}