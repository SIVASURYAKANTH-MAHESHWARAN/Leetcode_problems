class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,int[]>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new int[]{1,i,0,1});
            }
            else{
                int[]arr=map.get(nums[i]);
                int gap=i-arr[1];
                if(arr[2]==0){
                    arr[2]=gap;
                }
                else{
                    if(arr[2]!=gap){
                        arr[3]=0;
                    }
                }
                arr[1]=i;
                arr[0]++;
                map.put(nums[i],arr);
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int[]arr=map.get(nums[i]);
            if(arr[0]>=3 && arr[3]==1){
                // System.out.println(nums[i]);
                cnt++;
            }
            arr[3]=0;
            map.put(nums[i],arr);
        }
        return cnt;
    }
}