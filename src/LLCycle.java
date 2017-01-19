
public class LLCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(3);
		input.next = input1;
		input1.next = input2;
		input2.next = input1;
		System.out.println(detectCycle(input).val);

	}
	public static ListNode detectCycle(ListNode a) {
		if(a == null)
			return null;
		if(a.next != null && a.next == a)
			return a;
		ListNode slow = a;
		ListNode fast = a;
		boolean first = true;
		while(slow!=null && fast.next!=null){
			if (!first) {
				if (slow == fast)
					break;
			} else
				first = false;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow != fast)
			return null;
		slow = a;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

}
