// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public static void main(String[] args) {
		System.out.println(solution("baba. . .! asdf sadf .! ? asdfa sd d?    ?a a aa a"));
		
	}
    public static int solution(String S) {
        // write your code in Java SE 8
        ArrayList<String> list = new ArrayList<String>();
        char[] chars = S.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length ; i++){
            if(chars[i] != '.' && chars[i] != '?' && chars[i] != '!') {
                str.append(chars[i]);
            }
            else{
                list.add(str.toString());
                str = new StringBuilder();
            }
        }
        if(!str.toString().isEmpty())
        		list.add(str.toString());
        for(String l: list)
         System.out.println(l);
        int max = 0;
        int count = 0;
        for(String s : list){
            count = 0;
            char[] words = s.toCharArray();
            StringBuilder word = new StringBuilder();
            for(int i = 0 ;i < words.length ; i++){
                if(words[i] == ' '){
                    if(word.toString().length() !=0){
                        count++;
                        word = new StringBuilder();
                    }
                }
                else{
                    word.append(words[i]);
                }
            }
            if(word.toString().length() !=0)
                count++;
            if(count > max)
                max = count;
        }
        return max;
    }
}
