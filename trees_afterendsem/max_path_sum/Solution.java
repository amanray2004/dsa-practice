package trees_afterendsem.max_path_sum;

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
  public int maxPathSum(TreeNode root) {
        int [] ans= new int[1];
        findsum(root,ans);
        return ans[0];
  }
  private int findsum(TreeNode t,int[] ans,int sum){
        if(t==null)return 0;
        sum =0
        int l = findsum(t.left,ans);
        int r = findsum(t.right,ans);
  }
}
