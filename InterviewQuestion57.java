package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion57
 * @date 2020-07-05 0:39
 */
public class InterviewQuestion57 {
    public int[] findNumbersWithSum(int[] data, int sum) {
        if (null == data || data.length == 0) {
            throw new RuntimeException("传入的数组不能为空！");
        }
        int before = 0;
        int behind = data.length - 1;
        int[] num = new int[2];
        while (before < behind) {
            long sumTemp = data[before] + data[behind];
            if (sumTemp == sum) {
                num[0] = data[before];
                num[1] = data[behind];
                break;
            } else if (sumTemp < sum) {
                before ++;
            } else {
                behind --;
            }
        }
        return num;
    }
}
