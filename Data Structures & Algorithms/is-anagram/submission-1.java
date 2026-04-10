class Solution {
    public boolean isAnagram(String s, String t) {
            int[]  freq=new int [26];
            for(char x:s.toCharArray())
             freq[x - 'a']++;
            for(char x:t.toCharArray())
             freq[x - 'a']--;
            for(int val:freq)
            {
                if(val!=0)
                return false;
            }
            return true;
    }
}
