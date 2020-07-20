package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-06-02.
 * @time 1:00
 */
public class InterviewQuestion27 {
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }
    public void mirroeRecursively(BinaryTreeNode root) {
        if (root == null) {
            throw new RuntimeException("二叉树不能为空！");
        }
        if (root.left == null && root.right == null) {
            return;
        }
        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirroeRecursively(root.left);
        mirroeRecursively(root.right);
    }
}
