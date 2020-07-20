package swordfingeroffer;

        import java.util.Comparator;
        import java.util.PriorityQueue;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion41
 * @date 2020-06-23 10:46
 */
public class InterviewQuestion41 {
    /**
     * 小顶堆
     */
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    /**
     * 大顶堆
     */
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void insertNum(int num) {
        if (((minHeap.size() + maxHeap.size()) & 1) == 0) {
            if (!maxHeap.isEmpty() && maxHeap.peek() > num) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            maxHeap.offer(num);
        } else {
            if (!minHeap.isEmpty() && minHeap.peek() < num) {
                minHeap.offer(num);
                num = maxHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double getMedian() {
        if ((minHeap.size() + maxHeap.size()) == 0) {
            throw new RuntimeException("没有数据！");
        }
        Double result;
        if (((minHeap.size() + maxHeap.size()) & 1) == 0) {
            result = (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
            result = Double.valueOf(minHeap.peek());
        }
        return result;
    }

}
