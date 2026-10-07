class Solution {
    public int minOperations(int n) {
        int mid=n/2;
        int num=(n%2!=0)?mid*2+1:mid*2;
        int sum=0;
        // for(int i=0;i<n;i++){
        //     System.out.println(2*i+1);
        // }
        for(int i=0;i<n/2;i++){
            sum+=Math.abs((2*i+1)-num);
            // System.out.println(sum);
        }
        // System.out.println(num);
        return sum;
    }
}