class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ind1=0,len1=players.length;
        int ind2=0,len2=trainers.length;
        int cnt=0;
        while(ind1<len1 && ind2<len2){
            if(players[ind1]<=trainers[ind2]){
                cnt++;
                ind1++;
                ind2++;
            }
            else{
                ind2++;
            }
        }
        return cnt;
    }
}