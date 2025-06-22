class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (s == e) return nums[s];
            if (nums[m] >= nums[s] && nums[s] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }

        return -1;
    }
}