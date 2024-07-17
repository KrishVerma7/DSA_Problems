class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]>result = new ArrayList<>();
        result.add(new int[]{intervals[0][0],intervals[0][0]});
        int lastIdx = 0;
        for(int[] interval : intervals){
            int s = interval[0];
            int e = interval[1];
            if(s<= result.get(lastIdx)[1]){
                if(e>result.get(lastIdx)[1]){
                    result.get(lastIdx)[1]=e;
                }
            }else{
                result.add(new int[]{s,e});
                lastIdx++;
            }
        }
        return result.toArray(new int [result.size()][]);
    }
}