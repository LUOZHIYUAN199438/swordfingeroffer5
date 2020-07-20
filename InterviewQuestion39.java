package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion39
 * @date 2020-06-22 19:17
 */
public class InterviewQuestion39 {
    public int moreThanHalfNumber(int[] arr) {
        if (null == arr || 0 == arr.length) {
            throw new RuntimeException("数组为空！");
        }
        int num = arr[0];
        int times = 1;
        for (int i = 1; i < arr.length; i++) {
            if (0 == times) {
                num = arr[i];
                times = 1;
                continue;
            }
            if (num == arr[i]) {
                times ++;
            } else {
                times --;
            }
        }
        return num;
    }
}
