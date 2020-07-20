package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-09.
 * @time 0:14
 */
public class InterviewQuestion17 {
    private void printNumber(char[] chars){
        boolean isBegging0 = true;
        //char[] chars = str.toCharArray();
        for(int i = 0;i < chars.length;i ++){
            if(isBegging0 && chars[i] != '0'){
                isBegging0 = false;
            }
            if(!isBegging0){
                System.out.print(chars[i]);
            }
        }
        System.out.println();
    }

    private void print1ToMaxOfNRecursively(char[] chars,int length,int index){

        if(index == length - 1){
            printNumber(chars);
            return;
        }

        for (int i = 0; i < 10; i++) {
            chars[index + 1] = (char) (i + '0');
            print1ToMaxOfNRecursively(chars,length,index + 1);
        }
    }

    public void print1ToMaxOfN(int n){
        if(n < 0){
            return;
        }
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = (char) (0 + '0');
        }
        for (int i = 0; i < 10; i++) {
            chars[0] = (char) (i + '0');
            print1ToMaxOfNRecursively(chars,n,0);
        }

    }

    public static void main(String[] args) {
        InterviewQuestion17 interviewQuestion17 = new InterviewQuestion17();
        interviewQuestion17.print1ToMaxOfN(3);
    }
}
