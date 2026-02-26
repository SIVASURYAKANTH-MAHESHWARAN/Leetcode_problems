class Solution {
    public String smallestSubsequence(String s) {
        int[]arr=new int[26];
        Stack<Character>stk=new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            arr[s.charAt(i)-'a']=i;
        }
        boolean[]vis=new boolean[26];
        Arrays.fill(vis,true);
        for(int i=0;i<len;i++){
            if(vis[s.charAt(i)-'a']==false){
                continue;
            }
            while(!stk.isEmpty() && stk.peek()>s.charAt(i) && arr[stk.peek()-'a']>i){
                vis[stk.pop()-'a']=true;
            }
            stk.push(s.charAt(i));
            vis[s.charAt(i)-'a']=false;
        }
        String str=new String();
        for(char ch:stk){
            str+=ch;
        }
        return str;
    }
}