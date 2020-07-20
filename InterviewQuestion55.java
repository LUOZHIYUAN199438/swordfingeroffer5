package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion55
 * @date 2020-07-04 22:17
 */
public class InterviewQuestion55 {
    public int deepthTree(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int nLeftTree = deepthTree(root.left);
        int nRightTree = deepthTree(root.right);
        return (nLeftTree > nRightTree) ? (nLeftTree + 1) : (nRightTree + 1);
    }
}
