
public class SwapLLnodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(3);
		input.next = input1;
		input1.next = input2;
		input2.next = input1;
		ListNode n = swapPairs(input);
		while(n!=null){
			System.out.println(n.val);
			n=n.next;
		}

	}
	public static ListNode swapPairs(ListNode a) {
		int length = 0;
		ListNode node = a;
	    while(node!=null){
	         node = node.next;
	         length++;
	    }
	    if(length < 2)
	    	return a;
	    ListNode temp,prev,next;
	    node = a;
    	ListNode h = new ListNode(0);
        h.next = a;
        ListNode p = h;
	   while(p.next != null && p.next.next != null){
	    	ListNode t1 = p;
        p = p.next;
        t1.next = p.next;
 
        //use t2 to track next node of the pair
        ListNode t2 = p.next.next;
        p.next.next = p;
        p.next = t2;
    }
		return h.next;
	}
}
