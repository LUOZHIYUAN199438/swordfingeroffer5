package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-28.
 * @time 16:15
 */
public class LIS {
    public static int getLIS(int[] n){
        int ans = 0;
        int nLen = n.length;
        int[] dp = new int[nLen];
        for(int i = 0;i < nLen;i ++){
            dp[i] = 1;
            for(int j = 0;j < i;j ++){
                if(n[j] > n[i]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n1 = {200,160,130,197,200};
        int[] n = {2,1,5,3,6,4,6,3};
        //System.out.println(getLIS(n1));
        String str = "   ";
        String[] strs = str.split(" ");
        System.out.println(strs.length);
    }
}


