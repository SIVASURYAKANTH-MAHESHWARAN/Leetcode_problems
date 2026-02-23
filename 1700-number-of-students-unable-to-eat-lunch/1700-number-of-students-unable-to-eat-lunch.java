class Solution {
    public int countStudents(int[] stu, int[] san) {
        int len=stu.length;
        int ind1=0;
        int ind2=0;
        Queue<Integer>que=new LinkedList<>();
        while(ind1<len){
            if(stu[ind1]==san[ind2]){
                ind1++;
                ind2++;
            }
            else{
                que.add(stu[ind1++]);
            }
        }
        // System.out.print("fuck");
        while(ind2<len){
            if(que.peek()==san[ind2]){
                que.poll();
                ind2++;
            }
            else{
                int temp=0;
                int size=que.size();
                while(temp<size && que.peek()!=san[ind2]){
                    int ele=que.poll();
                    que.add(ele);
                    temp++;
                }
                if(temp==size){
                    break;
                }
                else{
                    que.poll();
                    ind2++;
                }
            }
        }
        return que.size();
    }
}