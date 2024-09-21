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

    int previous = Integer.MAX_VALUE;
    int answer = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return answer;
    }

    public void inorder(TreeNode root) {
        if (root.left != null) {
            inorder(root.left);
        }

        answer = Math.min(answer, Math.abs(root.val - previous));
        previous = root.val;

        if (root.right != null) {
            inorder(root.right);
        }
    }
}
