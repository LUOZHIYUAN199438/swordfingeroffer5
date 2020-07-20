package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion50
 * @date 2020-07-04 14:39
 */
public class InterviewQuestion50 {
    public int FirstNotRepeatingChar(String str) {
        if (null == str || "".equals(str)) {
            return -1;
        }
        char[] chars = str.toCharArray();
        int[] hashTable = new int[256];
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int tmp = chars[i];
            hashTable[tmp] ++;
        }
        for (int i = 0; i < n; i++) {
            if (hashTable[chars[i]] == 1) {
                return i;
            }
        }
        return 0;
    }
}
