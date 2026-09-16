class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int n=fruits.length;
        for(int right=0;right<n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[left],map.get(fruits[left])-1);
                    if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                    }
                    left++;
                }
            }
            else{
                ans=Math.max(ans,right-left+1);
            }
            
        }
        return ans;
    }
}