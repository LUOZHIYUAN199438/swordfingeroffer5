package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-26.
 * @time 15:21
 */
public class InterviewQuestion5 {
    public String replaceBlank(String str){
        if (str == null || "".equals(str)){
            return null;
        }
        // 将原字符串转化为字符数组
        char[] strs = str.toCharArray();
        int strsLen = strs.length;

        // 统计原字符串的空格
        int blankCount = 0;
        for(int i = 0;i < strsLen;i ++){
            if(' ' == strs[i]){
                blankCount ++;
            }
        }

        // 新的字符数组的长度
        int newLen = strsLen + blankCount * 2;
        if(newLen == strsLen){
            return str;
        }
        int originalIndex = strsLen - 1;
        int newIndex = newLen - 1;
        // 新的字符数组
        char[] newStrs = new char[newLen];

        while (originalIndex < newIndex){
            if(strs[originalIndex] != ' '){
                newStrs[newIndex --] = strs[originalIndex --];
            }else{
                newStrs[newIndex --] = '0';
                newStrs[newIndex --] = '2';
                newStrs[newIndex --] = '%';
                originalIndex --;
            }
        }

        return String.valueOf(newStrs);
    }

    public boolean backWork(String str){
        if(str == null || "".equals(str)){
            return false;
        }
        char[] strs = str.toCharArray();
        int strsLen = strs.length;
        int mid = strsLen / 2;
        int stop = strsLen - 1 - mid;
        for(int i = 0;i < mid;i ++){
            if(strs[i] == strs[strsLen - 1 - i]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        InterviewQuestion5 interviewQuestion5 = new InterviewQuestion5();
        String str1 = null;
        String str2 = "";
        String str3 = " ";
        String str4 = "  ";
        String str = "luozh";
        System.out.println(interviewQuestion5.replaceBlank(str));
    }
}
