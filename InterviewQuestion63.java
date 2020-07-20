package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion63
 * @date 2020-07-05 17:34
 */
public class InterviewQuestion63 {
    public int maxDiff(int[] number) {
        if (null == number || number.length < 2) {
            throw new IllegalArgumentException("参数不正确！");
        }
        int min = number[0];
        int maxDiff = number[1];
        for (int i = 2; i < number.length;i ++) {
            if (number[i - 1] < min) {
                min = number[i - 1];
            }
            int currentMax = number[i] - min;
            if (currentMax > maxDiff) {
                maxDiff = currentMax;
            }
        }
        return maxDiff;
    }
}
