import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String[] str = my_string.split("");
        
        String[] answer = Arrays.copyOf(str, n);
        
        String s = String.join("", answer);
        
        return s;
    }
}