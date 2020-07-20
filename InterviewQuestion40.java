package swordfingeroffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion40
 * @date 2020-06-22 21:05
 */
public class InterviewQuestion40 {
    public List<Integer> getLeastKNumbers(int[] input, int k) {
        if (null == input || k <= 0) {
            throw new RuntimeException("参数不正确！");
        }
        List<Integer> resultList = new ArrayList<>();
        int length = input.length;
        if (length < k) {
            return resultList;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < length; i++) {
            int curValue = input[i];
            if (priorityQueue.size() < k) {
                priorityQueue.add(curValue);
            } else {
                if (curValue < priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.add(curValue);
                }
            }
        }
        resultList.addAll(priorityQueue);
        return resultList;
    }
}
