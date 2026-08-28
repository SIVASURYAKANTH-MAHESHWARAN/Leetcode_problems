class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] arr, int lower, int upper) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            if(num>=lower && num<=upper){
            set.add(num);
            }
        }
        int ind=0;
        int[]nums=new int[set.size()];
        for(int val:set){
            nums[ind++]=val;
        }
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        int curr=lower;
        for(int val:nums){
            List<Integer>lis=new ArrayList<>();
            if(curr<val){
                lis.add(curr);
                lis.add(val-1);
                list.add(lis);
            }
            curr=val+1;
        }
        if(curr<=upper){
            List<Integer>lis=new ArrayList<>();
            lis.add(curr);
            lis.add(upper);
            list.add(lis);
        }
        return list;
    }
}