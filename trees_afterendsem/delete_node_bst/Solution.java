package trees_afterendsem.delete_node_bst;

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
        }}

        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null) return null;
            if(root.val==key){
                if(root.left==null && root.right==null) return null;
                if (root.left==null) return root.right;
                if (root.right==null) return root.left;
                TreeNode temp = root.right;
                while(temp.left!=null){
                    temp = temp.left;
                }
                temp.left=root.left;
                return root.right;
            }
            if(root.val>key) root.left = deleteNode(root.left,key);
            else root.right = deleteNode(root.right,key);
            return root;
        }
}
