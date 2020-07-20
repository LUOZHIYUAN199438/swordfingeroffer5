package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-05-28.
 * @time 0:00
 */
public class InterviewQuestion19 {
    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        // 如果字符串和模式都到结尾，返回true
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        // 如果模式到了结尾，字符串没有到结尾，返回false
        if (patternIndex == pattern.length && strIndex != str.length) {
            return false;
        }
        // 模式的当前位置的下一个位置为*
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            // 模式的当前位置和字符串的当前位置一样，或者模式的当前位置是.
            if (strIndex < str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
                // 分三种情况：1.视x*匹配0个字符，即*前一个字符出现0次 情况b1，2.匹配1个字符，即*前一个字符仅出现1次 情况b2
                // 3.匹配1个字符，模式保持不变 情况b3
                return matchCore(str, strIndex, pattern, patternIndex + 2)
                        || matchCore(str,strIndex + 1, pattern, patternIndex + 1)
                        || matchCore(str, strIndex + 1, pattern, patternIndex);
            } else {
                // 第一个位置不匹配，模式后移两位  也就是视x*匹配0个字符
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }
        // 第一个字符匹配，但模式第二个不是* 模式和字符串上都后移一位
        if (strIndex < str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        } else {
            return false;
        }
    }

    public boolean match(String string,String patternStr) {
        char[] str = string.toCharArray();
        char[] pattern = patternStr.toCharArray();
        return matchCore(str, 0, pattern, 0);
    }

    public static void main(String[] args) {
        InterviewQuestion19 interviewQuestion19 = new InterviewQuestion19();
        System.out.println(interviewQuestion19.match("aaa","ab*a"));

    }
}
