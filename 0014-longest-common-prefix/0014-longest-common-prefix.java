class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer>map=new HashMap<>();
        // for(int i=0;i<strs[0].length();i++){
        //     set.add(strs[0].substring(0,i));
        //     // System.out.println(strs[0].substring(0,i+1));
        // }
        // for(int i=1;i<strs.length();i++){
        //     String str=new String();
        //     for(int j=0;j<strs[i].length();j++){
        //         if(set.containsKey(strs[i].substring(0,j+1))){
        //             str=strs[i].substring(0,j+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     if(str==""){

        //     }
        // }
        for(String str:strs){
            for(int i=0;i<str.length();i++){
                String str1=str.substring(0,i+1);
                map.put(str1,map.getOrDefault(str1,0)+1);
            }

        }
        String ans=new String();
        for(String str:map.keySet()){
            if(map.get(str)==strs.length){
                if(ans.length()<=str.length()){
                    ans=str;
                }
            }
        }
        return ans;
    }
}