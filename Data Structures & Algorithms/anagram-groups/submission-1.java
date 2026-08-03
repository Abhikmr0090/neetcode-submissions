class Solution {

    /*
     * Algorithm:
     *
     * 1. Create a HashMap where:
     *      Key   -> Sorted version of a string.
     *      Value -> List of all strings having the same sorted key.
     *
     * 2. Traverse each string in the input array.
     *
     * 3. For every string:
     *      a. Convert it to a character array.
     *      b. Sort the character array.
     *      c. Convert the sorted array back to a String.
     *         This sorted string becomes the key.
     *
     * 4. Check whether the key exists in the HashMap.
     *      - If it does not exist:
     *          Create a new list, add the current string,
     *          and insert it into the HashMap.
     *
     *      - If it already exists:
     *          Retrieve the existing list and add the current
     *          string to that list.
     *
     * 5. After processing all strings, each HashMap entry
     *    contains one group of anagrams.
     *
     * 6. Add all the HashMap values to the answer list.
     *
     * 7. Return the answer.
     *
     * Time Complexity: O(n * k log k)
     *      n = Number of strings
     *      k = Average length of each string
     *
     * Space Complexity: O(n * k)
     */

    public List<List<String>> groupAnagrams(String[] strs) {

        // Stores sorted string as key and list of anagrams as value
        HashMap<String, List<String>> hm = new HashMap<>();

        // Final answer
        List<List<String>> ans = new ArrayList<>();

        // Process every string
        for (int i = 0; i < strs.length; i++) {

            // Original string
            String original = strs[i];

            // Convert string to character array
            char[] c = original.toCharArray();

            // Sort characters
            Arrays.sort(c);

            // Create the key
            String key = new String(c);

            // If key is not present, create a new group
            if (!hm.containsKey(key)) {
                List<String> newList = new ArrayList<>();
                newList.add(original);
                hm.put(key, newList);
            }
            // Otherwise add to the existing group
            else {
                List<String> existingList = hm.get(key);
                existingList.add(original);
            }
        }

        // Copy all grouped anagrams into the answer list
        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}