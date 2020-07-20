package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion64
 * @date 2020-07-05 17:57
 */
public class InterviewQuestion64 {
    public int sumFromOneToN(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += sumFromOneToN(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        InterviewQuestion64 interviewQuestion64 = new InterviewQuestion64();
        System.out.println(interviewQuestion64.sumFromOneToN(5));
    }
}
