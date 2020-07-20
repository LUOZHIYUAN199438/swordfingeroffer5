package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-05.
 * @time 23:05
 */
public class InterviewQuestion16{

    public double power(double base,int exponent){
        // 1.exponent = 0,base = 0
        if(exponent == 0 && base == 0){
            return 0;
        }
        // 2.exponent = 0
        if(exponent == 0){
            return 1;
        }
        // 3.base = 0
        if(base == 0 && exponent > 0){
            return 0;
        }
        // 4.exponent < 0 && base == 0
        if(exponent < 0){
            if(base == 0){
                throw new IllegalArgumentException("分母不能为0！");
            }else {
                double result = powerWithUnsignedExponent(base,-exponent);
                return 1 / result;
            }
        }
        // 5.exponent < 0 && base != 0
        double result = powerWithUnsignedExponent(base,exponent);
        return result;

    }


    private double powerWithUnsignedExponent(double base,int exponent){
        double result = 1.0;
        for(int i = 1;i <= exponent;i ++){
            result  *= exponent;
        }
        return result;
    }

    public static void main(String[] args) {
        InterviewQuestion16 interviewQuestion16 = new InterviewQuestion16();
        System.out.println(interviewQuestion16.power(2,2));
    }
}
