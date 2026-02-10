import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character,String> mp = new HashMap<>();
        for(int i = 0;i<pattern.length();i++){
            char ch1 = pattern.charAt(i);
            String ch2 = words[i];
            if(mp.containsKey(ch1)){
                if(!mp.get(ch1).equals(ch2)) return false;
            }
            else if(mp.containsValue(ch2)){
                return false;
            }
            else{
                mp.put(ch1,ch2);
            }
        }
        return true;
    }
}