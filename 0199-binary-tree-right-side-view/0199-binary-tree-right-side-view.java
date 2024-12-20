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
    public List<Integer> rightSideView(TreeNode root) {
     ArrayList<Integer> list =new ArrayList<>();
        helper(root,list,0);
        return list;
        
    }
    public void helper(TreeNode curr, ArrayList<Integer>list,int depth){
        if(curr == null){
            return;
        }
        if(depth == list.size()){
            list.add(curr.val);
        }
        helper(curr.right,list,depth+1);
        helper(curr.left,list,depth+1);
    }
}