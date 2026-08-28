class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int length=arr.length;
        // System.out.println(length);
        for(int val:arr){
            if(val>=1 && val<=arr.length){
                    set.add(val);
            }
        }
        int len=set.size();
        int ind=0;
        int[]nums=new int[len];
        for(int num:set){
            nums[ind++]=num;
        }
    //    int len=nums.length;
       int curr=1;
       Arrays.sort(nums);
       for(int val:nums){
        System.out.print(val+" ");
       }
       List<Integer>lis=new ArrayList<>();
       for(int val:nums){
        if(curr<val){
            for(int i=curr;i<=val-1;i++){
                lis.add(i);
            }
            // lis.add(curr);
            // if(curr!=val-1){
            // lis.add(val-1);
            // }
        }
        curr=val+1;
       }
       if(curr<=length){
          for(int i=curr;i<=length;i++){
                lis.add(i);
            }
       }
       return lis; 
    }
}