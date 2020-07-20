package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * Company:Mopon
 * @name InterviewQuestion44
 * @date 2020-06-28 8:34
 */
public class InterviewQuestion44 {
    public int digitAtIndex(int index) {
        if (index < 0) {
            return -1;
        }
        int digits = 1;
        while (true) {
            int numbers = countOfInteger(digits);
            if (index < numbers * digits) {
                return digitAtIndex(index, digits);
            }
            index -= digits * numbers;
            digits ++;
        }
    }
    private int countOfInteger(int digits) {
        if (digits == 1) {
            return 10;
        }
        int count = (int) Math.pow(10, digits - 1);
        return 9 * count;
    }

    private int beginNumber(int digits) {
        int begin = (int) Math.pow(10, digits - 1);
        return begin;
    }

    private int digitAtIndex(int index, int digits) {
        int number = beginNumber(digits) + index / digits;
        int indexFromRight = digits - index % digits;
        for (int i = 1; i < indexFromRight; i ++) {
            number /= 10;
        }
        return number % 10;
    }
}
