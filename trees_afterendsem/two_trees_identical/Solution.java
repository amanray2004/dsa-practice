package trees_afterendsem.two_trees_identical;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;

        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}}

// if(p==null && q==null) return true;

// return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
// }
//showed error