class Solution {
    private void find(int ind,int[] nums,List<List<Integer>> res,List<Integer> curr)
    {
        res.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            find(i+1,nums,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        find(0,nums,res,new ArrayList<>());
        return res;
    }
}
