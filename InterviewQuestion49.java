package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion49
 * @date 2020-07-04 10:29
 */
public class InterviewQuestion49 {
    private boolean isUgly(int number) {
        while (0 == number % 2) {
            number /= 2;
        }
        while (0 == number % 3) {
            number /= 3;
        }
        while (0 == number % 5) {
            number /= 5;
        }
        return 1 == number ? true : false;
    }
    public int getUglyNumber(int index) {
        if (index <= 0) {
            throw new RuntimeException("参数不能小于或者等于0！");
        }
        int number = 0;
        int uglyIndex = 0;
        while (uglyIndex < index) {
            number ++;
            if (isUgly(number)) {
                uglyIndex ++;
            }
        }
        return number;
    }
    // 已空间换时间的解法
    public int getUglyNumber2(int index) {
        if (index <= 0) {
            throw new RuntimeException("参数不能小于或者等于0！");
        }
        int[] result = new int[index];
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        result[0] = 1;
        for (int i = 1; i < index; i ++) {
            result[i] = Math.min(Math.min(result[t2] * 2,result[t3] * 3), result[t5] * 5);
            if (result[i] == result[t2] * 2) {
                t2 ++;
            }
            if (result[i] == result[t3] * 3) {
                t3 ++;
            }
            if (result[i] == result[t5] * 5) {
                t5 ++;
            }
        }
        return result[index - 1];
    }
}
