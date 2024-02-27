/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int max = Depth(root.left) + Depth(root.right);
        max = Math.max(max, diameterOfBinaryTree(root.left));
        max = Math.max(max, diameterOfBinaryTree(root.right));

        return max;
    }

    private int Depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null) {
            return 1 + Depth(node.right);
        } else if (node.right == null) {
            return 1 + Depth(node.left);
        }

        return 1 + Math.max(Depth(node.left), Depth(node.right));
    }
}












