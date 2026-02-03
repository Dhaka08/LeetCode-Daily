class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);    
            }
            else{
                mp.put(arr[i],1);
            }
        }
        HashSet<Integer> seen = new HashSet<>();
        for(int freq:mp.values()){
            if(!seen.add(freq)){
                return false;
            }
        }
        return true;
    }
}