package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion65
 * @date 2020-07-05 21:10
 */
public class InterviewQuestion65 {
    public int addTwoNumber(int num1, int num2) {
        while (0 != num2) {
            int curSum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = curSum;
            num2 = carry;
        }
        return num1;
    }
}
