class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap();
        List<List<String>> ans = new ArrayList<List<String>>();

        for (int i = 0; i < strs.length; i++) {
            String original = strs[i];
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (!hm.containsKey(key)) {
                List<String> newList = new ArrayList();
                newList.add(original);
                hm.put(key, newList);
            } else {
                List<String> st = hm.get(key);
                st.add(original);
            }
        }

        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
