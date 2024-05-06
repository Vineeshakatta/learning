package basic;

import java.util.HashMap;

class BST {
	
	public static void main(String[] args) {
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		
		BST bst = new BST();
		bst.buildTree(inorder, postorder);
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        int[] cal = {postorder.length-1};
        return helper(inorder, postorder, 0, postorder.length-1, map, cal);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int left, int right, HashMap<Integer, Integer> map, int[] cal){
        if(left>=right) {
            return null;
        }
        
        int currentVal = postorder[cal[0]];
        TreeNode root = new TreeNode(currentVal);
//        if(left==right) {
//        	System.out.println(root +" " + currentVal);
//            return null;
//        }
        int index = map.get(currentVal);
        System.out.println(cal[0]+" "+currentVal + " " + index);
        if(cal[0]==0) {
        	return null;
        }
        cal[0] = cal[0]-1;
        root.right = helper(inorder, postorder, index+1, postorder.length-1, map, cal);
        root.left = helper(inorder, postorder, 0, index-2, map, cal);
        return root;
    }
	
	class TreeNode {
		int value;
		int height;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}
		
	private TreeNode root;
	
	public BST() {
		
	}
	
	public int height(TreeNode node) {
		if(node==null) {
			return -1;
		}
		return node.height;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public TreeNode insert(int value, TreeNode node) {
		if(node==null) {
			node = new TreeNode(value);
			return node;
		}
		if(value<node.value) {
			node.left = insert(value, node.left);
		}
		if(value>node.value){
			node.right = insert(value, node.right);
		}
		node.height = Math.max(height(node.left), height(node.right)) +1;
		return node;
	}
		

}
