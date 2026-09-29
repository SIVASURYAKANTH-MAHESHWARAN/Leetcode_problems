class Solution {

    public int countIntersectingIntervals(int[][] intervals) {

        List<int[]> lis = new ArrayList<>();
        int cnt = 0;

        for (int[] arr : intervals) {

            if (!lis.isEmpty()) {

                for (int[] a : lis) {

                    int beg = a[0];
                    int end = a[1];

                    if (beg <= arr[1] && arr[0] <= end) {
                        cnt++;
                    }
                }
            }

            lis.add(arr);
        }

        return cnt;
    }
}