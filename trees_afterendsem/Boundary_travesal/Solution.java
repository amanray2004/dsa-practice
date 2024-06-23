// package trees_afterendsem.Boundary_travesal;


// import java.util.ArrayList;

// public class Solution {
// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

//     private static ArrayList <Integer> preorder(Node n,ArrayList <Integer> res){
//         if(n==null) return res;
//         if(n.left==null && n.right==null) return res;
//         res.add(n.data);
//         if(n.left!=null) preorder(n.left,res);
//         if(n.right!=null) preorder(n.right,res);
//         return res;

//     }
//     private static ArrayList<Integer> postorder(Node n,ArrayList<Integer> res){
//         if(n==null) return res;
//         if(n.left==null && n.right==null) return res;
//         if(n.right!=null) postorder(n.right,res);
//         if(n.left!=null) postorder(n.left,res);
//         res.add(n.data);
//         return res;
    
//     }
// 	ArrayList <Integer> boundary(Node node)
// 	{

// 	    ArrayList <Integer> res = new ArrayList <Integer> ();
//         ArrayList<Integer> temp = new ArrayList<Integer>();
//         res.add(node.data);
//         temp = preorder(node.left,temp);
//         for(int i=0;i<temp.size();i++){
//             res.add(temp.get(i));
//         }
//         temp.clear();
//         temp = postorder(node.right,temp);
//         for(int i=0;i<temp.size();i++){
//             res.add(temp.get(i));
//         }
//         return res;
// 	}
// }

package trees_afterendsem.Boundary_travesal;

import java.util.ArrayList;

public class Solution {

    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    private static void addLeftBoundary(Node node, ArrayList<Integer> res) {
        Node curr = node;
        while (curr != null) {
            if (!isLeaf(curr)) {
                res.add(curr.data);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    private static void addRightBoundary(Node node, ArrayList<Integer> res) {
        ArrayList<Integer> temp = new ArrayList<>();
        Node curr = node;
        while (curr != null) {
            if (!isLeaf(curr)) {
                temp.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }

    private static void addLeaves(Node node, ArrayList<Integer> res) {
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        if (node.left != null) {
            addLeaves(node.left, res);
        }
        if (node.right != null) {
            addLeaves(node.right, res);
        }
    }

    private static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) {
            return res;
        }

        if (!isLeaf(node)) {
            res.add(node.data);
        }

        addLeftBoundary(node.left, res);
        addLeaves(node, res);
        addRightBoundary(node.right, res);

        return res;
    }
}
