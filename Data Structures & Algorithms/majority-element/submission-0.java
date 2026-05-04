class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                cand=nums[i];
            }
            if(nums[i]==cand)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int ci=0;
        for(int n:nums)
        {
            if(n==cand) ci++;
        }
        if(ci>nums.length/2)
        {
            return cand;
        }else
        {
            return -1;
        }
    }
}