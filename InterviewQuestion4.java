package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-26.
 * @time 9:32
 */
public class InterviewQuestion4 {
    public boolean findTarget(int[][] array,int target){
        // 判断数组是否为空
        if (array == null){
            return false;
        }

        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column >= 0){
            if (array[row][column] == target){
                return true;
            }
            if (array[row][column] > target){
                column --;
            }else {
                row ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr1 = null;
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        //System.out.println(new InterviewQuestion4().findTarget(arr,0));

        String str = "luo  zhi ";
        System.out.println(str.toCharArray().length);
    }
}
