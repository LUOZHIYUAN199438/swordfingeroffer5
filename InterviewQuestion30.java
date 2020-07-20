package swordfingeroffer;
import	java.util.Stack;

import java.util.Stack;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * Company:Mopon
 * @name InterviewQuestion30
 * @date 2020-06-13 14:57
 */
public class InterviewQuestion30 {

    Stack<Integer> mData = new Stack<>();
    Stack<Integer> mMin = new Stack<>();

    public void push(Integer value) {
        mData.push(value);
        if ((mMin.size() == 0) || (value < mMin.peek())) {
            mMin.push(value);
        } else {
            mMin.push(mMin.peek());
        }
    }

    public void pop() {
        if ((mData.size() == 0) && (mMin.size() == 0)) {
            throw new RuntimeException("数据栈和辅助栈都已经为空，无法pop出数据！");
        }
        mData.pop();
        mMin.pop();
    }

    public Integer min() {
        if (mMin.size() == 0) {
            throw new RuntimeException("辅助栈已经为空，没有最小值！");
        }
        return mMin.peek();
    }
}
