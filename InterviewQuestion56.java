package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion56
 * @date 2020-07-04 23:54
 */
public class InterviewQuestion56 {

    public int[] findNumsAppearOnce(int[] array) {
        if (null == array || array.length < 2) {
            return null;
        }
        int[] num = new int[2];
        // 所有数字异或结果
        int resultOfXor = 0;
        for (int i = 0; i < array.length; i ++) {
            resultOfXor ^= array[i];
        }
        // 异或结果右边第一个为1的位数
        int indexOf1 = findFirstBitsIs1(resultOfXor);
        // 分组，该位数为1的为一组，不为1的为一组,然后分别异或
        for (int j = 0; j < array.length; j ++) {
            if (isBit1(array[j], indexOf1)) {
                num[0] ^= array[j];
            } else {
                num[1] ^= array[j];
            }
        }
        return num;
    }

    /**
     * 在整数num的二进制中找到最右边是1的位
     * @param num
     * @return
     */
    private int findFirstBitsIs1(int num) {
        int index = 0;
        while ((num & 1) == 0 && index < 32) {
            num = num >> 1;
            index ++;
        }
        return index;
    }

    /**
     * 判断整数num从右边开始的第indexOf1位是不是1
     * @param num
     * @param indexOf1
     * @return
     */
    private boolean isBit1(int num, int indexOf1) {
        num = num >> indexOf1;
        return ((num & 1) == 1);
    }
}
