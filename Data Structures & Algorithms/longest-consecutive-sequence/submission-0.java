class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxLength = 1;
        int length = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];

            if (diff == 0) {
                continue; // Ignore duplicates
            }

            if (diff == 1) {
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }

        return Math.max(maxLength, length);
    }
}