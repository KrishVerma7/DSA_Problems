// Merge Overlapping Sub-intervals
//In this problem, you're given a collection of intervals, where each interval consists of a start and end point. Your task is to merge overlapping intervals and return a new list of non-overlapping intervals.
//Example:
//Input: [[1, 3], [2, 6], [8, 10], [15, 18]]
//Output: [[1, 6], [8, 10], [15, 18]]

import java.util.*;

public class July_10_Problem_1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> ans = mergeOverLappingIntervals(arr);
        System.out.println("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.println("[" + it.get(0) + ", " + it.get(1)+"]");
        }
        System.out.println();
    }

    private static List<List<Integer>> mergeOverLappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }

}
