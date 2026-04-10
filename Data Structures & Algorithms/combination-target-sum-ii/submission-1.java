class Solution {
    private void find(int ind,int[] candidates,int target,List<List<Integer>> res,List<Integer>curr)
    
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind&& candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            curr.add(candidates[i]);
            find(i+1,candidates,target-candidates[i],res,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}
