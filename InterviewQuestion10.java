package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-04-02.
 * @time 9:18
 */
public class InterviewQuestion10 {
    public int Fibonacci(int n){
        if(n <= 0){
            System.out.println("参数不合法！");
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3;i <= n;i ++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        InterviewQuestion10 interviewQuestion10 = new InterviewQuestion10();
        // System.out.println(interviewQuestion10.Fibonacci(0));
        // System.out.println(interviewQuestion10.Fibonacci(1));
        // System.out.println(interviewQuestion10.Fibonacci(2));
        //System.out.println(interviewQuestion10.Fibonacci(3));
        System.out.println(interviewQuestion10.Fibonacci(5));
    }
}
