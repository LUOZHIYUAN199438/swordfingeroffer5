package swordfingeroffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion32
 * @date 2020-06-13 18:12
 */
public class InterviewQuestion32 {
    public void fun(TreeNode root) {
        if (null == root) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");
            if (null != tempNode.left) {
                queue.add(tempNode.left);
            }
            if (null != tempNode.right) {
                queue.add(tempNode.right);
            }
        }
    }
}

