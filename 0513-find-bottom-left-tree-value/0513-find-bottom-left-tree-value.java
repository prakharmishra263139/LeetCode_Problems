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
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> temp =new LinkedList<>();
        temp.add(root);

        int res=0;

        while(!temp.isEmpty()){
            int n = temp.size();

            for(int i=0;i<n;i++){
                TreeNode current  = temp.poll();

                if(i==0){
                    res = current.val;
                }

                if(current.left !=null){
                    temp.add(current.left);
                }

                 if(current.right !=null){
                    temp.add(current.right);
                }
            }
        }
       return res; 
    }
}