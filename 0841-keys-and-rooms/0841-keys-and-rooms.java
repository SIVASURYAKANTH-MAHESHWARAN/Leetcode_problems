class Solution {
    public void recurr(List<List<Integer>>room,boolean[]arr,int ind){ 
        arr[ind]=true;
        for(int i=0;i<room.get(ind).size();i++){
            if(arr[room.get(ind).get(i)]!=true){
            recurr(room,arr,room.get(ind).get(i));
            }
        }
        }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]arr=new boolean[rooms.size()];
        Arrays.fill(arr,false);
        recurr(rooms,arr,0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
              
                return false;
            }
           
        }
        return true;
    }
}