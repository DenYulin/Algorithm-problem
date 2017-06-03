public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length <= 0 || in.length <= 0)
            return null;
        TreeNode root = reConstructCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode reConstructCore(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        // 判断是否到达边界
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        // 构建根节点
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                // 构建左子树
                root.left = reConstructCore(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                // 狗就按右子树
                root.right = reConstructCore(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}