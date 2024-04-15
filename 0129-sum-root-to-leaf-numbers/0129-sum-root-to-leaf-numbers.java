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

    int sum=0;
    public int sumNumbers(TreeNode root) {

        getLeafSum(root,0);

        return sum;
        
    }
    public void getLeafSum(TreeNode root,int num){
        if(root ==null){
            return;
        }
        
        // form the number
        num = num*10+root.val;

        if(root.left==null && root.right== null){
            sum = sum+num;
            return;
        }

        getLeafSum(root.left,num);

        getLeafSum(root.right,num);

    }
}