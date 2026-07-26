class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]amt=new int[amount+1];
        Arrays.fill(amt,Integer.MAX_VALUE);
        amt[0]=0;
        for(int i=0;i<coins.length;i++){
            int coin=coins[i];
            for(int j=coin;j<=amount;j++){
                int value=amt[j-coin]==Integer.MAX_VALUE?Integer.MAX_VALUE:amt[j-coin]+1;
                amt[j]=Math.min(value,amt[j]);
            }
        }
        return amt[amount]==Integer.MAX_VALUE?-1:amt[amount];
    }
}