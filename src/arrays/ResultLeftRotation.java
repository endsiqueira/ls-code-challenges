package arrays;

import java.util.List;

class ResultLeftRotation {
    public static int[] rotateLeft(int d, List<Integer> arr) {

    int n = arr.size();
    int[] rotatedArray = new int[n];

    Integer[] arrArray = arr.toArray(new Integer[0]);
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + n - d) % n] = arrArray[i];
        }
        return rotatedArray;
    }
}
