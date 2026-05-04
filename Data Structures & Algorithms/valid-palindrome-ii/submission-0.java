class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        boolean res=true;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                res=isPalind(s,l+1,r)|| isPalind(s,l,r-1);
                break;
            }
            l++;
            r--;
        }
        return res;
    }
    private boolean isPalind(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))

            return false;
            l++;
            r--;
        }
        return true;
    }
}
