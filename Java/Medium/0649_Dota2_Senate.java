import java.util.*;
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for(int i =0;i<n;i++){
            if(senate.charAt(i)=='R'){
                radiant.add(i);
            }
            else{
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.peek()<dire.peek()){
                radiant.add(n++);
            }
            else{
                dire.add(n++);
            }
            radiant.poll();
            dire.poll();
        }
        if(radiant.size()==0){
            return "Dire";
        }
        else{
            return "Radiant";
        }        
    }
}