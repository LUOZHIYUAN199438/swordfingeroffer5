package swordfingeroffer;


/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-26.
 * @time 21:14
 */
public class InterviewQuestion7 {

    // 树节点
    private static class TreeNode{

        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }

    // [from,to)
    public int[] copyOfRangeArray(int[] array,int from,int to){
        if (array == null || array.length == 0){
            return null;
        }
        if(from < 0 || from >= array.length || to <= from || to > array.length){
            return null;
        }

        int newLen = to - from;
        int[] newArray = new int[newLen];

        for(int i = 0; i < newLen;i ++){
            newArray[i] = array[from + i];
        }

        return newArray;
    }



    public TreeNode rebuiltBinaryTree(int[] preOrder,int[] midOrder){

        if(preOrder == null || midOrder == null){
            return null;
        }

        if (preOrder.length == 0 || midOrder.length == 0){
            return null;
        }

        if(preOrder.length != midOrder.length){
            return null;
        }

        int rootValue = preOrder[0];
        int rootIndexInMinOrder = 0;
        boolean flag = false;
        for(int i = 0;i < midOrder.length;i ++){
            if(midOrder[i] == rootValue){
                rootIndexInMinOrder = i;
                flag = true;
                break;
            }
        }
        // 在中序中没有找到根节点说明输入的两个数组无法构建二叉树
        if(!flag){
            System.out.println("无法构建二叉树！");
            throw new RuntimeException("无效输入！");
        }

        TreeNode root = new TreeNode(preOrder[0]);

        root.left = rebuiltBinaryTree(copyOfRangeArray(preOrder,1,rootIndexInMinOrder + 1),copyOfRangeArray(midOrder,0,rootIndexInMinOrder));
        root.right = rebuiltBinaryTree(copyOfRangeArray(preOrder,rootIndexInMinOrder + 1,preOrder.length),copyOfRangeArray(midOrder,rootIndexInMinOrder + 1,midOrder.length));
        return root;
    }

    // 中序输出
    public void outPutBinaryTree(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            outPutBinaryTree(root.left);
        }
        System.out.println(root.value);
        if (root.right != null){
            outPutBinaryTree(root.right);
        }
    }

    public static void main(String[] args) {
        //int[] a = {1,2,4,7,3,5,6,8};
        //int[] b = {4,7,2,1,5,3,8,6};
        int[] a = {3,1};
        int[] b = {1,3};
        InterviewQuestion7 interviewQuestion7 = new InterviewQuestion7();
        TreeNode root = interviewQuestion7.rebuiltBinaryTree(a,b);
        interviewQuestion7.outPutBinaryTree(root);
    }
}
