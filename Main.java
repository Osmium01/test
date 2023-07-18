import java.util.*;

public class Main{
    public static void main(String[] args){
        String st = "ama@n";
        char[] ch = st.toCharArray();
        int s = 0;
        int e = st.length() - 1;

       while(s < e){
        if(ch[s] >= 'a' && ch[s] <= 'z'){

            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
            
        }
        
       }
       
       String newStr = new String(ch);
       System.out.println(newStr);
        
    }
}