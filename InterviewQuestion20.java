package swordfingeroffer;

import org.apache.commons.lang3.StringUtils;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-31.
 * @time 9:47
 */
public class InterviewQuestion20 {
    // 判断E|e后面
    private boolean afterE(int index, int len, char[] chars) {
        // E|e 处于最后一位
        if (index == len) {
            return false;
        }
        for (int i = index; i < len; i++) {
            // E|e 后面只有+|-
            if ((chars[i] == '+') || (chars[i] == '-')) {
                if (len - i == 1) {
                    return false;
                } else {
                    continue;
                }
            }
            // E|e 后面的字符不是1~9
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
    // 判断.后面
    private boolean afterPoint(int index, int len, char[] chars) {
        // . 处于最后一位
        if (index == len) {
            return false;
        }
        for (int i = index; i < len; i++) {
            // .后面是E|e
            if ((chars[i] == 'E') || (chars[i] == 'e')) {
                if (len - i == 1) {
                    return false;
                } else {
                    return afterE(i + 1, len, chars);
                }
            }
            // . 后面不是0~9
            if ((chars[i] < '0') || (chars[i] > '9')) {
                return false;
            }
        }
        return true;
    }
    // 判断整数部分
    private boolean afterInteger(int index, int len, char[] chars) {
        // +|-处于最后一位
        if ((chars[index] == '+') || (chars[index] == '-')) {
            if ((len - index == 1) || ((index + 1 < len) && chars[index + 1] == '.')) {
                return false;
            }
        }
        for (int i = index; i < len; i ++) {
            if ((chars[i] == '+') || (chars[i] == '-')) {
                continue;
            }
            if (chars[i] == '.') {
                return afterPoint(i + 1, len, chars);
            }
            if ((chars[i] == 'E') || (chars[i] == 'e')) {
                return afterE(i + 1, len, chars);
            }
            if ((chars[i] < '0') || (chars[i] > '9')) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumbersic(String str) {
        if (StringUtils.isBlank(str)) {
            throw new RuntimeException("字符串不能为空！");
        }
        int len = str.length();
        char[] chars = str.toCharArray();
        return afterInteger(0, len, chars);
    }

    public static void main(String[] args) {
        InterviewQuestion20 interviewQuestion20 = new InterviewQuestion20();
        String str = "-1E-16";
        System.out.println(interviewQuestion20.isNumbersic(str));
    }
}
