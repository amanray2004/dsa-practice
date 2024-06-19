package trees_afterendsem.diameter_of_binary_tree;

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
  }
  
    public int diameterOfBinaryTree(TreeNode root) {
        int [] ans= new int[1];
        depth(root,ans);
        return ans[0];
    }

    private int depth(TreeNode root ,int [] ans){
        if (root==null) return 0;

        int l =depth(root.left,ans);
        int r= depth(root.right,ans);
        ans[0] =Math.max(ans[0],l+r);
        return Math.max(l,r)+1;
    }
}
