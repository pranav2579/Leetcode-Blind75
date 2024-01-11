/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null)
            return null;
 
        // If either n1 or n2 matches with root's key,
        // report the presence by returning root (Note that
        // if a key is ancestor of other, then the ancestor
        // key becomes LCA
        if (root.val == p.val || root.val == q.val)
            return root;
 
        // Look for keys in left and right subtrees
        TreeNode left_lca = lowestCommonAncestor(root.left, p, q);
        TreeNode right_lca = lowestCommonAncestor(root.right, p, q);
 
        // If both of the above calls return Non-NULL, then
        // one key is present in once subtree and other is
        // present in other, So this node is the LCA
        if (left_lca != null && right_lca != null)
            return root;
 
        // Otherwise check if left subtree or right subtree
        // is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }
}
// @lc code=end

