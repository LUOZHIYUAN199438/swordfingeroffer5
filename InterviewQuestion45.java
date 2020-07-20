package swordfingeroffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion45
 * @date 2020-07-04 9:53
 */
public class InterviewQuestion45 {
    public String printMinNumber(int[] numbers) {
        if (null == numbers || 0 == numbers.length) {
            return null;
        }
        List<String> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(String.valueOf(num));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
