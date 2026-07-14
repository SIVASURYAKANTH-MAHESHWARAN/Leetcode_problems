class Solution {
    public String minRemoveToMakeValid(String s) {
        int len=s.length();
        boolean[]rm=new boolean[len];
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<len;i++){
            
            if(s.charAt(i)==')'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    rm[i]=true;
                }
            }
            if(s.charAt(i)=='('){
                stk.push(i);
            }
        }
        while(!stk.isEmpty()){
            rm[stk.pop()]=true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            if(rm[i]==false){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}