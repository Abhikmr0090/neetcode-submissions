class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] elements = new int[k];

        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int trav = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(trav == k)
             break;

            elements[trav++] = key;

        }

        return elements;
    }
}