package swordfingeroffer;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion37
 * @date 2020-06-21 23:38
 */
public class InterviewQuestion37 {

    private int index = -1;

    /**
     * 将二叉树序列化
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        if (null == root) {
            stringBuilder.append("##,");
            return stringBuilder.toString();
        }
        stringBuilder.append(root.val + ",");
        stringBuilder.append(serialize(root.left));
        stringBuilder.append(serialize(root.right));
        return stringBuilder.toString();
    }

    /**
     * 将字符串反序化成二叉树
     * @param str
     * @return
     */
    public TreeNode deSerialize(String str) {
        index ++;
        if (index >= str.length()) {
            return null;
        }
        String[] split = str.split(",");
        TreeNode node = null;
        if (!("##".equals(split[index]))) {
            node = new TreeNode(Integer.parseInt(split[index]));
            node.left = deSerialize(str);
            node.right = deSerialize(str);
        }
        return node;
    }
}
