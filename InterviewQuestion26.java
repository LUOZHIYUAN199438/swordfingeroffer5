package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-06-02.
 * @time 0:23
 */
public class InterviewQuestion26 {
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }

    public boolean hasSubtree(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        boolean result = false;
        if (pRoot1 != null && pRoot2 != null) {
            if (pRoot1.value == pRoot2.value) {
                result = DoesTree1HaveTree2(pRoot1, pRoot2);
            }
            if(!result) {
                result = hasSubtree(pRoot1.left, pRoot2);
            }
            if (!result) {
                result = hasSubtree(pRoot1.right, pRoot2);
            }
        }
        return result;
    }

    private boolean DoesTree1HaveTree2(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        if (pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null) {
            return false;
        }
        if (pRoot1.value != pRoot2.value) {
            return false;
        }
        return DoesTree1HaveTree2(pRoot1.left, pRoot2.left) || DoesTree1HaveTree2(pRoot1.right, pRoot2.right);
    }

}
