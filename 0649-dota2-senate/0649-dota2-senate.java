class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>que1=new LinkedList<>();
        Queue<Integer>que2=new LinkedList<>();
        int len=senate.length();
        for(int i=0;i<len;i++){
            if(senate.charAt(i)=='R'){
                que1.add(i);
            }
            else{
                que2.add(i);
            }
        }
        while(!que1.isEmpty() && !que2.isEmpty()){
            int ch1=que1.poll();
            int ch2=que2.poll();
            if(ch1<ch2){
                que1.add(len+ch1);
            }
            else{
                que2.add(len+ch2);
            }
        }
        return que1.isEmpty()?"Dire":"Radiant";
    }
}