class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n=getsum(n);
        }
        return n==1;
        // int slow=n;
        // int fast=n;
        // do{
        //     slow=getsum(slow);
        //     fast=getsum(getsum(fast));
        // }while(slow!=fast);
        // return slow==1;
    }
    private int getsum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}
