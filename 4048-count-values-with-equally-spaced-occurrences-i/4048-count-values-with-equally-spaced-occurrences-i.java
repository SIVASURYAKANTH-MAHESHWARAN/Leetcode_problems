class Solution {
    public int countSpecialIntegers(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        int n=arr.length;
        int cnt=0;
        // for(int i=0;i<n;i++){
        //     if(map.get(arr[i])==3){
        //     System.out.print(arr[i]+" ");
        //     }
        // }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==3){
                int var=0;
                int rec=i;
                boolean flag=true;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        if(var==0){
                            var=j-i;
                            rec=j;
                        }
                        else{
                            int sp=j-rec;
                            if(sp!=var){
                                map.put(arr[i],-1);
                                flag=false;
                                break;
                            }
                            rec=j;
                        }
                        // System.out.print()
                    }
                }
                if(flag){
                    map.put(arr[i],-1);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}