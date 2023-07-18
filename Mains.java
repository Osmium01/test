public class Mains {
    public static void main(String[] args){
        String input = "in@#rvi#w";

        char[] ch = input.toCharArray();

        int s = 0;
        int e = ch.length - 1;

        for(int i = 0; i < ch.length; i++)
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                char temp = ch[s];
                ch[s] = ch[e];
                ch[e] = temp;

                s++;
                e--;
            }

            System.out.println(ch);
        }




 } 



    





// in@#rvi#w

// wi@#vrn#i
