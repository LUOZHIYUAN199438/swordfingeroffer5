package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion51
 * @date 2020-07-04 15:45
 */
public class InterviewQuestion51 {
    int count = 0;
    public int inversePairs(int[] array) {
        if (null != array) {
            mergeSortUpDown(array, 0, array.length - 1);
        }
        return count;
    }
    private void mergeSortUpDown(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortUpDown(a, start, mid);
        mergeSortUpDown(a, mid + 1, end);
        merge(a, start, mid, end);
    }
    private void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                tmp[k ++] = a[i ++];
            } else {
                tmp[k ++] = a[j ++];
                count += mid - i + 1;
            }
        }
        while (i <= mid) {
            tmp[k ++] = a[i ++];
        }
        while (j <= end) {
            tmp[k ++] = a[j ++];
        }
        for (int index = 0; index < tmp.length; index ++) {
            a[start + k] = tmp[k];
        }
    }
}
