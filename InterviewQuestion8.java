package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-04-01.
 * @time 22:35
 */
public class InterviewQuestion8 {

    private static class TreeLinkNode{
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
        TreeLinkNode(int val){
            this.val = val;
        }
    }

    public TreeLinkNode getNext(TreeLinkNode curNode){
        if (curNode.right != null){
            TreeLinkNode node = curNode.right;
            while (node.left != null){
                node = node.left;
            }
            return node;
        }else{
            while(curNode.next != null){
                TreeLinkNode parent = curNode.next;
                if(parent.left == curNode){
                    return parent;
                }
                parent = parent.next;
            }
        }
        return null;
    }
}
