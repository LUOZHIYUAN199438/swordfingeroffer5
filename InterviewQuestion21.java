package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 16:11
 */
public class InterviewQuestion21 {
    public void reorderOddEvent(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("数组不能为空！");
        }
        int pre = 0;
        int post = arr.length - 1;
        while (pre < post) {
            if ((arr[pre] % 2 == 0) && (arr[post] % 2 != 0)) {
                int temp = arr[pre];
                arr[pre] = arr[post];
                arr[post] = temp;
                pre ++;
                post --;
                continue;
            }
            if (arr[pre] % 2 != 0) {
                pre ++;
            }
            if(arr[post] % 2 == 0) {
                post --;
            }
        }
    }

    public static void main(String[] args) {
        InterviewQuestion21 interviewQuestion21 = new InterviewQuestion21();
        int[] arr = {1,2,3,4,5};
        interviewQuestion21.reorderOddEvent(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
