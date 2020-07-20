package swordfingeroffer;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayDeque;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * Company:Mopon
 * @name Test2
 * @date 2020-07-18 17:53
 */
public class Test2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums) {
            return new int[0];
        }
        if (k <= 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        ArrayDeque<Integer> queue = new ArrayDeque();
        for (int i = 0; i < nums.length; i ++) {
            if (queue.isEmpty()) {
                queue.add(i);
                continue;
            }
            if (i - queue.peekFirst() >= k) {
                queue.pollFirst();
            }
            while (!(queue.isEmpty()) && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.add(i);
            if (i >= k - 1) {
                res[i + 1 - k] = nums[queue.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] input = {7,2,4};
        int[] res = test2.maxSlidingWindow(input,2);
        for (int i = 0; i < res.length; i ++) {
            System.out.print(res[i] + " ");
        }
    }
}
