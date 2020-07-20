package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion58
 * @date 2020-07-05 10:16
 */
public class InterviewQuestion58 {

    public String reverseSentence(String str) {
        if (null == str || 0 == str.length()) {
            throw new IllegalArgumentException("传入的字符串不能为空！");
        }
        String res = reverse(str);
        String[] resArr = res.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < resArr.length - 1; i ++) {
            stringBuilder.append(reverse(resArr[i])).append(" ");
        }
        stringBuilder.append(reverse(resArr[resArr.length - 1]));
        return String.valueOf(stringBuilder);
    }

    private String reverse(String str) {
        if (null == str || "".equals(str)) {
            throw new IllegalArgumentException("传入的字符串不能为空！");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i --) {
            stringBuilder.append(str.charAt(i));
        }
        return String.valueOf(stringBuilder);
    }
}
