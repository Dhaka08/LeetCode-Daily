class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }
}