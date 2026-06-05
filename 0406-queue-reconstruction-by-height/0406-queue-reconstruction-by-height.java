class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
        if(a[0]==b[0])
            return a[1]-b[1];
        return b[0]-a[0];});
        ArrayList<int[]>lis=new ArrayList<>();
        for(int a[]:people){
            lis.add(a[1],a);
        }
        return lis.toArray(new int[people.length][]);
    }
}