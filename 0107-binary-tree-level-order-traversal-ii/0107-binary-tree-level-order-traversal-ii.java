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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Solve(root, ans, 0);
        
        List<List<Integer>> reverseAns = new ArrayList<>();
        for(int i = ans.size() -1; i>=0;i--){
            reverseAns.add(ans.get(i));
        }
        return reverseAns;
    }
    
    void Solve(TreeNode root, List<List<Integer>> ans, int level){
        
        if(root == null) return;
        if(ans.size() <= level){
            ans.add(new ArrayList <Integer>());
        }
        ans.get(level).add(root.val);
        Solve(root.left, ans, level + 1);
        Solve(root.right, ans, level + 1);

    }
}