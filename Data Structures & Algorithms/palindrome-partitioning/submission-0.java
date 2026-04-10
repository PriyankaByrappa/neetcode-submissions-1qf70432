class Solution {
    public List<List<String>> partition(String s) {
     List<List<String>> res=new ArrayList<>();
     find(s,0,res,new ArrayList<>());
     return res;  
    }
    private void find(String s,int start,List<List<String>>res,List<String> curr)
    {
        if(start==s.length())
        {
            res.add(new ArrayList<>(curr));
        }
        for(int end=start;end<s.length();end++)
        {
            if(isPalin(s,start,end))
            {
                curr.add(s.substring(start,end+1));
                find(s,end+1,res,curr);
                curr.remove(curr.size()-1);
            }
        }
    } 
    private boolean isPalin(String s,int start,int end)
    { 
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;  
    }
}
