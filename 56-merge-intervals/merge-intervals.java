class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
        return new int[0][0];

        Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
    });

        List<int[]> merge = new ArrayList<>();
        for(int[] interval : intervals){
            if(merge.isEmpty() || merge.get(merge.size() - 1) [1] < interval[0]){
                merge.add(interval);
            }else {
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1) [1], interval[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}