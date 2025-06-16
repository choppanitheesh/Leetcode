class Solution {
    public int maximumDifference(int[] nums) {
        int premin = nums[0];
        int maxDiff = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > premin) {
                int diff = nums[i] - premin;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            } else {
                premin = nums[i];
            }
        }
        return maxDiff;
    }
}
