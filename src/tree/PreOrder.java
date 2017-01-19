package tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<Integer> preorderTraversal(TreeNode a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	    if(a == null)
	        return result;
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(a);
	    while(!stack.isEmpty()){
	        TreeNode t = stack.pop();
	        result.add(t.val);
	        if(t.right != null)
	            stack.push(t.right);
	        if(t.left !=null)
	            stack.push(t.left);
	    }
	    return result;
	}
}
