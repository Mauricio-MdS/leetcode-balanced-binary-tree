class Solution {
    public boolean isBalanced(TreeNode root) {
        return computeHeight(root) != -1;
    }

    private int computeHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = computeHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = computeHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}