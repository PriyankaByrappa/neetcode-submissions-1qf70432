class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            res.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            res.add(nums2[i]);
        }
        Collections.sort(res);
        int n=res.size();
        int mid=n/2;
        if(n%2==0)
        {
            return (res.get(mid-1)+res.get(mid))/2.0;
        }
        else
        {
            return res.get(mid);
        }
    }
}
