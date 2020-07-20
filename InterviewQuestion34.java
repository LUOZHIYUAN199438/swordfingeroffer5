package swordfingeroffer;
import	java.util.Stack;


/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion34
 * @date 2020-06-14 9:46
 */
public class InterviewQuestion34 {
    public void findPath(TreeNode root, int k) {
        if (null == root) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        findPath(root, k, stack);
    }

    private void findPath(TreeNode root, int k, Stack<Integer> pathStack) {
        if (null == root || k < 0) {
            return;
        }
        if (null == root.left && null == root.right) {
            if (k == root.val) {
                // 遍历路径
                for (int patnValue : pathStack) {
                    System.out.print(patnValue + " ");
                }
                System.out.print(root.val);
            }
        } else {
            pathStack.push(root.val);
            findPath(root.left, k - root.val, pathStack);
            findPath(root.right, k - root.val, pathStack);
            pathStack.pop();
        }
    }
}
