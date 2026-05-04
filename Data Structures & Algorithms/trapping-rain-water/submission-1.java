class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftmax=height[l],rightmax=height[r],water=0;
        while(l<r)
        {
            if(leftmax<rightmax)
            {
                l++;
                leftmax=Math.max(leftmax,height[l]);
                water+=leftmax-height[l];
            }
            else
            {
                r--;
                rightmax=Math.max(rightmax,height[r]);
                water+=rightmax-height[r];
            }
        }
        return water;
    }
}
