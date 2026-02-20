import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        solve(0, 0, "", n, res);

        return res;        
    }

    private void solve(int openP, int closeP, String s, int n, List<String> res) {
        if (openP == closeP && openP + closeP == n * 2) {
            res.add(s);
            return;
        }

        if (openP < n) {
            solve(openP + 1, closeP, s + "(", n, res);
        }

        if (closeP < openP) {
            solve(openP, closeP + 1, s + ")", n, res);
        }
    }    
}