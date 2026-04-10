class Solution {
    private void find(int ind,int[] nums,int target,List<List<Integer>> res,List<Integer> curr)
    {
        if(ind==nums.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(nums[ind]<=target)
        {
            curr.add(nums[ind]);
            find(ind,nums,target-nums[ind],res,curr);
            curr.remove(curr.size()-1);
        }
        find(ind+1,nums,target,res,curr);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        find(0,nums,target,res,new ArrayList<>());
        return res;
    }
}
