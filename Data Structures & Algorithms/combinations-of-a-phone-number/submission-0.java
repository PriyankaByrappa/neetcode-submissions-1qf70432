class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.length()==0) return res;
        String[] map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtrack(res,digits,map,0,new StringBuilder());
        return res;
    }
    private void backtrack(List<String> res,String digits,String[] map,int index,StringBuilder curr)
    {
        if(index==digits.length())
        {
            res.add(curr.toString());
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(char ch:letters.toCharArray())
        {
            curr.append(ch);
            backtrack(res,digits,map,index+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }

    }
}
