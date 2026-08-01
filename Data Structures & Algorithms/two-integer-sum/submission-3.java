class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap();

        for(int i=0;i<nums.length;i++) {
            int value = target-nums[i];
            if(hm.containsKey(value)) {
                return new int[]{hm.get(value), i};
            } else {
                hm.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
