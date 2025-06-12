class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maximum = Math.abs(nums[0]-nums[n-1]);
        for(int i=0;i<n-1;i++){
            maximum = Math.max(maximum,Math.abs(nums[i]-nums[i+1]));
        }
        return maximum;
    }
}