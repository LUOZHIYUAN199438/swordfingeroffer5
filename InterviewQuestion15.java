package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-05.
 * @time 22:11
 */
public class InterviewQuestion15 {
    public int numberOf1(int n){
        int count = 0;
        int flag = 1;
        while (flag > 0){
            if((n & flag) != 0){
                count ++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        InterviewQuestion15 interviewQuestion15 = new InterviewQuestion15();
        System.out.println(interviewQuestion15.numberOf1(-2147483645));
    }
}
