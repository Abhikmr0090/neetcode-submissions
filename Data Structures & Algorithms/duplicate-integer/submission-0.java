class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> al = new ArrayList();

        for(int i=0;i<nums.length;i++) {
            if(al.contains(nums[i])) {
                return true;
            } else {    
                al.add(nums[i]);
            }
        }

        return false;
    }
}