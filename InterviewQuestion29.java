package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-06-11.
 * @time 22:43
 */
public class InterviewQuestion29 {

    /**
     * 顺时针打印数字
     * @param numbers
     * @param columns
     * @param rows
     */
    public void printMatrixClockWisely(int[][] numbers, int columns, int rows) {
        if (null == numbers || columns <= 0 || rows <= 0) {
            return;
        }
        int start = 0;
        while ((columns > start * 2) && (rows > start * 2)) {
            printMatrixInCircle(numbers,rows,columns,start);
            start ++;
        }
    }

    /**
     * 打印一个数字
     * @param number
     */
    private void printNumber(int number) {
        System.out.print(number + " ");
    }

    /**
     * 顺时针打印一圈
     * @param numbers
     * @param rows
     * @param columns
     * @param start
     */
    private void printMatrixInCircle(int[][] numbers, int rows, int columns, int start) {
        int endX = columns - start - 1;
        int endY = rows - start - 1;
        // 从左到右打印一行
        for (int i = start; i <= endX; i ++) {
            int number = numbers[start][i];
            printNumber(number);
        }
        // 从上到下打印一行
        if (endY > start) {
            for (int i = start + 1; i <= endY; i ++) {
                int number = numbers[i][endX];
                printNumber(number);
            }
        }
        // 从右到左打印一行
        if (endX > start && endY > start) {
            for (int i = endX - 1; i >= start ; i --) {
                int number = numbers[endY][i];
                printNumber(number);
            }
        }
        // 从下到上打印一行
        if (endX > start && endY - 1 > start) {
            for (int i = endY - 1; i >= start + 1; i --) {
                int number = numbers[i][start];
                printNumber(number);
            }
        }
    }
}
