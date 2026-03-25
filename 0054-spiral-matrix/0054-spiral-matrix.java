class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int right=matrix[0].length-1;
        int left=0;
        int bottom=matrix.length-1;
        List<Integer>lis=new ArrayList<>();
        //  System.out.print(right+" "+bottom);
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
               
                lis.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                lis.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                lis.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                lis.add(matrix[i][left]);
            }
            left++;
            }
        }
        return lis;
    }
}