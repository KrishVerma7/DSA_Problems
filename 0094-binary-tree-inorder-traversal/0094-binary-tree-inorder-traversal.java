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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(ans,root);
        return ans;
    }

    void inorder(ArrayList<Integer> ans, TreeNode root){
        if(root == null){
            return;
        }
        inorder(ans, root.left);
        ans.add(root.val);
        inorder(ans,root.right);
    }
}