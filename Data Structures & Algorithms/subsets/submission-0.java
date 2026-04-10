class Solution {
    private void find(int ind,int[] nums,List<List<Integer>> res,List<Integer> curr)
    {
        res.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++)
        {
            curr.add(nums[i]);
            find(i+1,nums,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        find(0,nums,res,new ArrayList<>());
        return res;
    }
}
