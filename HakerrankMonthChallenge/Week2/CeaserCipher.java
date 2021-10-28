package Week2;


public class CeaserCipher {
  public static void main(String[] args) {
    String str = "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
    int key = 62;
    String s1 = "";
        for (int i=0;i<str.length();i++){
            int c = str.charAt(i);
            key =key % 26;
            if ((c>=65 && c<=90) || (c>=97 && c<=122)){
                if (c>=65 && c<=90 && c+key>90)
                    c=65+((c+key)-91);              
                else if (c>=97 && c<=122 && c+key>122)
                    c=97+((c+key)-123);
                else 
                    c=c+key;
                s1 += (char)c;
            }
            else 
                s1 += str.charAt(i);    
        }
        System.out.println(s1);
    }
}

