package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion62
 * @date 2020-07-05 17:00
 */
public class InterviewQuestion62 {
    public int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i ++) {
            last = (last + m ) % i;
        }
        return last;
    }
}
