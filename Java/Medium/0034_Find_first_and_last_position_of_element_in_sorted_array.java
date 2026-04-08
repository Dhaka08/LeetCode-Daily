class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int st = 0, end = n-1;
        int [] res = {-1,-1};
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]==target){
                res[0]= mid;
                end = mid - 1;
            }
            else if(nums[mid]<target) st = mid + 1;
            else end = mid - 1;
        }
        st =0;
        end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]==target){
                res[1]= mid;
                st = mid + 1;
            }
            else if(nums[mid]<target) st = mid + 1;
            else end = mid - 1;
        }
        return res;
    }
}