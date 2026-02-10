import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> mp = new HashMap<>();
        for(String s:strs){
            int [] count = new int [26];
            for(char ch: s.toCharArray()){
                count[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<String>());
            }
            mp.get(key).add(s);
        }
        return new ArrayList(mp.values());
    }
}