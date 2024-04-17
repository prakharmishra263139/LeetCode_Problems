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

    String small="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return small;
    }

    public void dfs(TreeNode root, String current){

        if(root==null){
            return;
        }

        current = (char)(root.val + 'a') + current;
        
        if(root.left==null && root.right==null){
            if(small==""){
                small=current;
            }else if(small.compareTo(current)>0){
                small =current;
            }
            return ;
        }

        dfs(root.left,current);
        dfs(root.right,current);
    }
}