package swordfingeroffer;

import java.util.Stack;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion31
 * @date 2020-06-13 16:01
 */
public class InterviewQuestion31 {
    public boolean IsPopOrder(int[] pushStack, int[] popSer) {
        if ((null == pushStack) || (null == popSer) || (pushStack.length == 0) || (popSer.length == 0) ||
                (popSer.length != pushStack.length)) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0;i < pushStack.length;i ++) {
            stack.push(pushStack[i]);
            while (!stack.isEmpty() && (popSer[j] == stack.peek())) {
                stack.pop();
                j ++;
            }
        }
        return stack.isEmpty();
    }
}
