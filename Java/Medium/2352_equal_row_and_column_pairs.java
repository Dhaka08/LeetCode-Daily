import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String,Integer> mp = new HashMap<>();
        //store rows
        for(int i =0;i<n;i++){
            String key = Arrays.toString(grid[i]);
            if(mp.containsKey(key)){
                mp.put(key,mp.get(key)+1);
            }
            else{
                mp.put(key,1);
            }
        }
        int count =0;
        //check columns
        for(int j =0;j<n;j++){
            int [] col = new int[n];
            for(int i =0;i<n;i++){
                col[i]=grid[i][j];
            }
            String key = Arrays.toString(col);
            if(mp.containsKey(key)){
                count+=mp.get(key);
            }
            else{
                count+=0;
            }
        }
        return count;
    }
}