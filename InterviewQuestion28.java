package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-06-03.
 * @time 0:27
 */
public class InterviewQuestion28 {
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }

    public boolean isSymetrical(BinaryTreeNode pRoot) {
        return isSymetrical(pRoot,pRoot);
    }

    private boolean isSymetrical(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }
        if (pRoot1.value != pRoot2.value) {
            return false;
        }
        return isSymetrical(pRoot1.left, pRoot2.right) && isSymetrical(pRoot1.right, pRoot2.left);
    }

}
