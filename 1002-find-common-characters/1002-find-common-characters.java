class Solution {
    public List<String> commonChars(String[] words) {
        List<String>lis=new ArrayList<>();
        int[]common=new int[26];

        for(int i=0;i<words[0].length();i++){
            common[words[0].charAt(i)-'a']++;
        }
        int len=words.length;
        for(int k=1;k<len;k++){
            int[]freq=new int[26];
            for(int i=0;i<words[k].length();i++){
                freq[words[k].charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                common[i]=Math.min(common[i],freq[i]);
            }
        }
        for(int i=0;i<26;i++){
            while(common[i]>0){
                lis.add(String.valueOf((char)(i+'a')));
                common[i]--;
            }
        }
        return lis;
    }
}