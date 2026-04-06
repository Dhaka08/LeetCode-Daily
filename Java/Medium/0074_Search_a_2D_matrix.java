class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //n = no of rows , m = no of cols 
        int n = matrix.length, m = matrix[0].length;
        int st = 0, end = n * m - 1;
        while(st<=end){
            int mid = st + (end-st)/2;
            int midel = matrix[mid/m][mid%m];
            if(midel == target) return true;
            if(target<midel) end = mid -1;
            else st = mid + 1;
        }
        return false;
    }
}