class Solution {
    public String removeDuplicateLetters(String s) {
        int[]arr=new int[300];
        int len=s.length();
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<len;i++){
            arr[s.charAt(i)]=i;
        }
        boolean[]vis=new boolean[300];
        Arrays.fill(vis,true);
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && stk.peek()>s.charAt(i) && arr[stk.peek()]>i && vis[s.charAt(i)]==true){
                vis[stk.peek()]=true;
                stk.pop();
            }
            if(vis[s.charAt(i)]){
                 stk.push(s.charAt(i));
            }
            vis[s.charAt(i)]=false;
        }
        String str=new String();
        while(!stk.isEmpty()){
            str+=stk.pop();
        }
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
}