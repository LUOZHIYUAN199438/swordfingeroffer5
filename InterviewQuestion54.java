package swordfingeroffer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 罗志远
 * @version 1.0
 * @name InterviewQuestion54
 * @date 2020-07-04 21:40
 */
public class InterviewQuestion54 {
    public TreeNode kthNode(TreeNode root, int k) {
        if (null == root || k <= 0) {
            return null;
        }
        List<TreeNode> cache = new ArrayList<>();
        kthNodeHelper(root, k, cache);
        return k <= cache.size() ? cache.get(k - 1) : null;
    }
    private void kthNodeHelper(TreeNode root, int k, List<TreeNode> cache) {
        if (null == root) {
            return;
        }
        kthNodeHelper(root.left, k, cache);
        cache.add(root);
        if (cache.size() == k) {
            return;
        }
        kthNodeHelper(root.right, k, cache);
    }
}
