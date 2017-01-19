import java.util.HashMap;

public class RandomLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		r1.random = r1;
		r1.next = r2;
		RandomListNode n = copyRandomList(r1);
		while(n!=null){
			System.out.println(n.label);
			n=n.next;
		}

	}
	 public static RandomListNode copyRandomList(RandomListNode head) {
		 if(head == null)
			 return null;
		 //RandomListNode n = r;
		 RandomListNode node = head;
		 HashMap<Integer,RandomListNode> map = new HashMap<Integer,RandomListNode>();
		 while(node!=null){
			 RandomListNode temp = new RandomListNode(node.label);
			 map.put(node.label, temp);
			 node = node.next;
		 }
		 //map.put(0,new RandomListNode(0));
		 node = head;
		 RandomListNode rHead = map.get(head.label);
		 RandomListNode ret = rHead;
		 RandomListNode n;
		 while(node != null){
			 n = map.get(node.label);
			 if(node.random == null){
				 n.random = null;
			 }
			 else {
				 n.random = map.get(node.random.label);
			 }
			 if(node.next == null){
				 n.next = null;
			 }
			 else {
				 n.next = map.get(node.next);
			 }
			 rHead.next = n;
			 rHead = rHead.next;
			 node = node.next;
		 }
		 return ret;
		 
	    }
}
