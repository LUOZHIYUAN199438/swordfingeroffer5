package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion66
 * @date 2020-07-05 22:01
 */
public class InterviewQuestion66 {
    public int[] multiply(int[] A) {
        int length = A.length;
        //创建B数组:长度和A相等
        int[] B = new int[length];
        // 特殊情况：A为空
        if (0 == length) {
            return B;
        }
        //先把下三角矩阵每一行的乘积作为B[i]的值
        B[0]=1;
        for(int i=1;i<length;i++){
            //当前行的B=上一行的B*当前行多的一个A
            B[i]=B[i-1]*A[i-1];
        }
        //把上三角的元素也乘到B上:
        //矩阵最后一行最后一个元素是1，从这个元素往上
        int temp=1;
        //从倒数第二行开始往上乘（最后一行的B已经是正确的）
        for(int j=length-2;j>=0;j--){
            temp=temp*A[j+1];
            B[j]=B[j]*temp;
        }
        return B;

    }
}
