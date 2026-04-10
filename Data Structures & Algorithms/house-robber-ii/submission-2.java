class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(robber(nums,0,nums.length-2),robber(nums,1,nums.length-1));
    }
    private int robber(int[] nums,int start,int end)
    {
        // if(start>end) return null;
        int prev2=0;
        int prev1=0;
        for(int i=start;i<=end;i++)
        {
            int curr=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
