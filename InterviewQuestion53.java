package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion53
 * @date 2020-07-04 20:22
 */
public class InterviewQuestion53 {
    public int getNumberOfK(int[] data, int k) {
        int number = 0;
        if (null != data && data.length > 0) {
            int first = getFirstK(data, k, 0, data.length - 1);
            int last = getLasttK(data, k, 0, data.length - 1);
            if (first > -1 && last > -1) {
                number = last - first + 1;
            }
        }
        return number;
    }
    private int getFirstK(int[] data, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middleIndex = (start + end) / 2;
        int middleData = data[middleIndex];
        if (k == middleData) {
            if ((middleIndex > 0 && k != data[middleIndex - 1]) || 0 == middleIndex){
                return middleIndex;
            } else {
                end = middleIndex - 1;
            }
        } else if (middleIndex > k) {
            end = middleIndex - 1;
        } else {
            start = middleIndex + 1;
        }
        return getFirstK(data, k, start, end);
    }

    private int getLasttK(int[] data, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middleIndex = (start + end) / 2;
        int middleData = data[middleIndex];
        if (k == middleData) {
            if ((middleIndex < data.length - 1 && k != data[middleIndex + 1]) || data.length - 1 == middleIndex){
                return middleIndex;
            } else {
                start = middleIndex + 1;
            }
        } else if (middleIndex < k) {
            start = middleIndex + 1;
        } else {
            end = middleIndex - 1;
        }
        return getFirstK(data, k, start, end);
    }
}
