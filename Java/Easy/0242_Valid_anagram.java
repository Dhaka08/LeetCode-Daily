import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(mp1.containsKey(ch)){
                mp1.put(ch,mp1.get(ch)+1);
            }
            else{
                mp1.put(ch,1);
            }
        }
        for(int i = 0;i<s.length();i++){
            Character ch = t.charAt(i);
            if(mp2.containsKey(ch)){
                mp2.put(ch,mp2.get(ch)+1);
            }
            else{
                mp2.put(ch,1);
            }
        }
        if(mp1.equals(mp2)) return true;
        return false;        
    }
}