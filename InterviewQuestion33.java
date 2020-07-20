package swordfingeroffer;

import java.util.Arrays;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * Company:Mopon
 * @name InterviewQuestion33
 * @date 2020-06-13 20:42
 */
public class InterviewQuestion33 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (null == sequence || 0 == sequence.length) {
            return false;
        }
        int restart = 0;
        int len = sequence.length;
        for (int i = 0; i < len - 1; i ++) {
            if (sequence[i] < sequence[len - 1]) {
                restart ++;
            }
        }
        if (0 == restart) {
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, len - 1));
        } else {
            for (int i = restart;i < len - 1; i ++) {
                if (sequence[i] <= sequence[len - 1]) {
                    return false;
                }
            }
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, restart));
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, restart, len - 1));

        }
        return true;
    }
}
