
public class RemoveNthNodeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(3);
		input.next = input1;
		input1.next = input2;
		input2.next = input1;
		ListNode n = removeNthFromEnd(input,2);
		while(n!=null){
			System.out.println(n.val);
			n=n.next;
		}
		

	}
	public static ListNode removeNthFromEnd(ListNode a, int b) {
	    int length= 0;
	    ListNode node = a;
	    while(node!=null){
	         node = node.next;
	         length++;
	    }
	    node = a;
	    int rl = 0;
	    if(b > length){
	    	rl = 1;
	    }
	    else{
	    	rl = length - b;
	    }
	    ListNode prev = a;
	    while(rl > 0){
	    	prev = node;
	    	node = node.next;
	    	rl--;
	    }
	    prev.next = node.next;
	    return a;
	    
	}

}
