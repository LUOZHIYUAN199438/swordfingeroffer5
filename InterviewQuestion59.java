package swordfingeroffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion59
 * @date 2020-07-05 11:47
 */
public class InterviewQuestion59 {
    public List<Integer> MaxInWindows1(int[] num, int size) {
        if (null == null || size <= 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < num.length; i ++) {
            if (q.isEmpty()) {
                q.add(i);
            }
            if (i - q.peekFirst() >= size) {
                q.pollFirst();
            }
            while (!(q.isEmpty()) && num[i] >= num[q.peekLast()]) {
                q.pollLast();
            }
            q.add(i);
            if (i >= size - 1) {
                arrayList.add(num[q.peekFirst()]);
            }
        }
        return arrayList;
    }
}
