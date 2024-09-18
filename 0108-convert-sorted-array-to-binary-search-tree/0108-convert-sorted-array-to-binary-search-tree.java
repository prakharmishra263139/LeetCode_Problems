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
public class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    return help(nums, 0, nums.length-1);
  }

  private TreeNode help(int[] nums, int left, int right){
    if (left>right){ 
        return null;
    }
    if (left==right) { 
        return new TreeNode(nums[left]);
    }
    int mid = (left+right)/2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = help(nums, left, mid-1);
    root.right = help(nums, mid+1, right);
    return root;
  }
}