class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(c != ' ') {
                sb.append(c);
            }
        }

        String newString = sb.toString().toLowerCase().replaceAll("[^a-z0-9]", "");;

        int start = 0;
        int end = newString.length()-1;
        
        while(start < end) {
            if(newString.charAt(start) != newString.charAt(end))
             return false;

            start++;
            end--; 
        }

        return true;
    }
}
