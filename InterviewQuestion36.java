package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion36
 * @date 2020-06-15 0:06
 */
public class InterviewQuestion36 {

    public TreeNode convert(TreeNode pRootOfTree) {
        TreeNode pLastNodeInList = null;
        convertNode(pRootOfTree, pLastNodeInList);
        TreeNode pHeadOfList = pLastNodeInList;
        while (null != pHeadOfList && null != pHeadOfList.left) {
            pHeadOfList = pHeadOfList.left;
        }
        return pHeadOfList;
    }

    private void convertNode(TreeNode pNode, TreeNode pLastNodeInList) {
        if (null == pNode) {
            return;
        }
        TreeNode pCurrent = pNode;
        if (null != pCurrent.left) {
            convertNode(pCurrent.left, pLastNodeInList);
        }
        pCurrent.left = pLastNodeInList;
        if (null != pLastNodeInList) {
            pLastNodeInList.right = pCurrent;
        }
        pLastNodeInList = pCurrent;
        if (null != pCurrent.right) {
            convertNode(pCurrent.right, pLastNodeInList);
        }
    }
}
