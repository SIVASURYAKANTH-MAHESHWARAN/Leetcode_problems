class Solution {
    ArrayList<List<Integer>>res=new ArrayList<>();
    public List<Integer> recurr(int[]candidates,int target,int ind,List<Integer>lis,int sum){
        //  for(int i=0;i<lis.size();i++){
        //         System.out.print(lis.get(i)+" ");
        //     }
        // System.out.println();
            if(sum==target){
            // System.out.println("hello");
          
            
            List<Integer>lis1=new ArrayList<>(lis);
            // Collections.sort(lis1);
            res.add(lis1);
            return lis;
        }
        if(sum>target||ind>=candidates.length){
            return lis;
        }

         sum+=candidates[ind];
        lis.add(candidates[ind]);
        recurr(candidates,target,ind+1,lis,sum);
        lis.remove(lis.size()-1);
        sum-=candidates[ind];
        while((ind+1<candidates.length) && (candidates[ind]==candidates[ind+1])){
            ind++;
        }
        recurr(candidates,target,ind+1,lis,sum);
        // ind++;
        return lis;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>lis=new ArrayList<>();
      
        recurr(candidates,target,0,lis,0);
        // List<List<Integer>>res1=new ArrayList<>(res);
        return res;
    }
}