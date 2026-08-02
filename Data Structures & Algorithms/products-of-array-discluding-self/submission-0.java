class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int zeroCount = 0;
        int[] ans = new int[nums.length];

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? (int) product : 0;
            } else {
                ans[i] = (int) (product / nums[i]);
            }
        }

        return ans;
    }
}