public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(4);
		ListNode input1 = new ListNode(1);
		//ListNode input2 = new ListNode(30);
		input.next = input1;
		//input1.next = input2;
		ListNode res = reverseList(input);
		System.out.println(res.val+","+res.next.val);
	}

	public static ListNode reverseList(ListNode a) {
		ListNode prev = null;
		ListNode jump = null;
		ListNode node = a;
		if(a == null)
		    return a;
		while(node!=null){
			jump = node.next;
			node.next = prev;
			prev = node;
			node = jump; 
		}
		return prev;
	}

}
