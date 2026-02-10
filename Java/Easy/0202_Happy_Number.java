import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n)){
            hs.add(n);
            int sum = 0;
            while(n!=0){
                int rem = n % 10;
                sum += rem * rem;
                n = n/10;
            }
            if(sum==1) return true;
            else n = sum;
        }
        return false;        
    }
}