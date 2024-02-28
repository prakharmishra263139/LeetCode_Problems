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
    int ans;
    public int findBottomLeftValue(TreeNode root) {
        ans = root.val;
        height(root,1);
        return ans;
    }

    int height=0;

    public void height(TreeNode root, int depth){
        if(root==null) return;

        if(depth>height){
            height = depth;
            ans = root.val;
        }

        height(root.left,depth+1);
        height(root.right,depth+1);
    }
}