class Solution {
public:
    int maxArea(vector<int>& heights) {
        int left=0;
        int right=heights.size()-1;
        int sum=0;
        while(left<right)
        {
        int water=min(heights[left],heights[right])*(right-left);
        sum=max(sum, water);
        if(heights[left] < heights[right])
        {
            left++;
        }
        else
          right--;
        }
        return sum;

    }
};
