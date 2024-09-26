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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList <String> ans = new ArrayList<>();
        String temp = "";
        solve(root,ans,temp);
        return ans;
    }
    
    void solve(TreeNode root, ArrayList<String> ans, String temp){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            temp += root.val;
            ans.add(temp);
            return;
        }
        temp += root.val + "->";
        solve(root.left,ans,  temp);
        solve(root.right, ans, temp);
    }
}