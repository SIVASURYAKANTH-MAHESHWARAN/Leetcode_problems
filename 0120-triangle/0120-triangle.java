class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>>alis=new ArrayList<>();
        for(int i=0;i<triangle.size();i++){
            alis.add(new ArrayList<>(triangle.get(i)));
        }
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int down=triangle.get(i).get(j)+alis.get(i+1).get(j);
                int diagonal=triangle.get(i).get(j)+alis.get(i+1).get(j+1);
                alis.get(i).set(j,Math.min(down,diagonal));
            }
        }
        return alis.get(0).get(0);
    }
}