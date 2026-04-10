class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int start=0;
        int end=numbers.size()-1;
        while(start<end)
        {
            int currentsum=numbers[start]+numbers[end];
            if(currentsum>target)
             end--;
            else if(currentsum<target)
             start++;
            else
              return {start+1,end+1};
        }
        return {};
    }
};
