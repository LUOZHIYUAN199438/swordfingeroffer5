package swordfingeroffer;

import java.util.Arrays;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion61
 * @date 2020-07-05 15:48
 */
public class InterviewQuestion61 {
    public boolean isContinuous(int[] numbers) {
        if (null == numbers || 0 == numbers.length) {
            return false;
        }
        int count = 0;
        int diff = 0;
        Arrays.sort(numbers);
        for (int i = 0;i < numbers.length - 1; i ++) {
            if (0 == numbers[i]) {
                count ++;
                continue;
            }
            if (numbers[i] != numbers[i + 1]) {
                diff += numbers[i + 1] - numbers[i] - 1;
            } else {
                return false;
            }
        }
        if (diff <= count) {
            return true;
        }
        return false;
    }
}
