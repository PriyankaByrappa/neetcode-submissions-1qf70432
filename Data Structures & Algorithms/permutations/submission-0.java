class Solution {
    private void find(int[] nums,boolean[] used,List<List<Integer>> res,List<Integer> curr)
    {
        if(nums.length==curr.size())
        {
         res.add(new ArrayList<>(curr));
         return;   
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]) continue;
            used[i]=true;
            curr.add(nums[i]);
            find(nums,used,res,curr);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        find(nums,new boolean[n],res,new ArrayList<>());
        return res;
    }
}
