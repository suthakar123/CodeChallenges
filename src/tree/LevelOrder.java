package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode a = new TreeLinkNode(10);
		TreeLinkNode b = new TreeLinkNode(11);
		TreeLinkNode c = new TreeLinkNode(12);
		TreeLinkNode d = new TreeLinkNode(13);
		a.left = b;
		a.right = c;
		b.right = d;
		LevelOrder(a);

	}
	public static void LevelOrder(TreeLinkNode a){
		Queue<TreeLinkNode> q1 = new LinkedList<TreeLinkNode>();
		Queue<TreeLinkNode> q2 = new LinkedList<TreeLinkNode>();
		System.out.print("n");
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		q1.add(a);
		while(!q1.isEmpty() || !q2.isEmpty()){
			while(!q1.isEmpty()){
				TreeLinkNode n = q1.poll();
				if(n.left != null)
					q2.add(n.left);
				if(n.right != null)
					q2.add(n.right);
				n.next = q1.peek();
			}
			while(!q2.isEmpty()){
				TreeLinkNode n = q2.poll();
				if(n.left != null)
					q1.add(n.left);
				if(n.right != null)
					q1.add(n.right);
				n.next = q2.peek();
			}
		}
	}

}
