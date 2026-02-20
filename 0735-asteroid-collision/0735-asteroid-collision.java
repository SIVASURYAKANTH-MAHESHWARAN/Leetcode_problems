class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>stk=new Stack<>();
        int len=arr.length;
        stk.push(arr[0]);
        for(int i=1;i<len;i++){
            if(!stk.isEmpty() && ((stk.peek()>0 && arr[i]>0)||(stk.peek()<0 && arr[i]<0)||(stk.peek()<0 && arr[i]>0))){
                
                stk.push(arr[i]);
            }
            else{
                boolean flag=true;
                while(!stk.isEmpty() && stk.peek()>0 && arr[i]<0 && Math.abs(stk.peek())<=Math.abs(arr[i])){
                    if(Math.abs(stk.peek())==Math.abs(arr[i])){
                        stk.pop();
                        flag=false;
                        break;
                    }
                
                        stk.pop();
                    
                }
                if((stk.isEmpty() && flag)||(!stk.isEmpty() && flag && stk.peek()<0 )){
                    stk.push(arr[i]);
                }
            }
        }
        int[]arr1=new int[stk.size()];
        int ind=0;
        while(!stk.isEmpty()){
            arr1[ind++]=stk.pop();
        }
        int ind1=0;
        int ind2=ind-1;
        while(ind1<=ind2){
            int temp=arr1[ind2];
            arr1[ind2]=arr1[ind1];
            arr1[ind1]=temp;
            ind1++;
            ind2--;
        }
        return arr1;
    }
}