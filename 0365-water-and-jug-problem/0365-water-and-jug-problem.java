class Solution {
    public int gcd(int x,int y){
        if(x==0){
            return y;
        }
        return gcd(y%x,x);
    }
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y<target){
            return false;
        }
        int num=gcd(Math.min(x,y),Math.max(x,y));
        // System.out.print(num);
        return (target%num==0)?true:false;
    }
}