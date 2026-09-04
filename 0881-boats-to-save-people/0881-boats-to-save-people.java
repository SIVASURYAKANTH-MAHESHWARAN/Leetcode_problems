class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int cnt=0;
        while(s<=e){
            int wt=people[s]+people[e];
            if(wt<=limit){
                cnt++;
                s++;
                e--;
            }
            else{
                cnt++;
                e--;
            }
        }
        return cnt;  
    }
}