package arrays;

import java.util.List;

class ResultHourGlass {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int c = 0; c <= 3; c++) {
            for (int l = 0; l <= 3; l++) {
                int sum = arr.get(c).get(l) + arr.get(c).get(l + 1) + arr.get(c).get(l + 2)
                        + arr.get(c + 1).get(l + 1)
                        + arr.get(c + 2).get(l) + arr.get(c + 2).get(l + 1) + arr.get(c + 2).get(l + 2);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
