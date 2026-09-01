class Solution {
    public int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(Math.min(x,y),Math.max(x,y)%Math.min(x,y));
    }
    public int findGCD(int[] nums) {
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;
        for(int val:nums){
            x=Math.min(x,val);
            y=Math.max(y,val);
        }
        return gcd(x,y);
    }
}