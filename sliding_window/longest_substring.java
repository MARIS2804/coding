package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class longest_substring {
    public static String length_substring(String a) {
        if(a.length()<=1){
            return a;
        }
        Set<Character> set = new HashSet<>();
        int l = 0;
        int max_len = 0;
        String max_string = "";
        for(int r = 0; r < a.length(); r++){
            while(set.contains(a.charAt(r))){ //iterate all through set for duplication
                set.remove(a.charAt(l));   // if duplication remove left value
                l += 1;   // increment left pointer(winodw shrinking)
            }
            set.add(a.charAt(r));           
            if((r - l + 1) > max_len){      //assigns longest substring
                max_len = r - l + 1;
                max_string = a.substring(l, r + 1);
            }
        }
        return max_string;
    }
    
    public static void main(String[] args) {
        String a = "";
        String result = length_substring(a);
        System.out.println("Longest substring without repeating characters: " + result);
    } 
}