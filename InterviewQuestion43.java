package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * Company:Mopon
 * @name InterviewQuestion43
 * @date 2020-06-24 23:07
 */
public class InterviewQuestion43 {
    public int numberOfOneToN(int n) {
        int number = 0;
        for (int i = 1; i <= n; i ++) {
            number += numberOfOne(i);
        }
        return number;
    }
    private int numberOfOne(int n) {
        int number = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                number ++;
            }
            n = n / 10;
        }
        return number;
    }
}
