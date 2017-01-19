
public class SubtractLLIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode b = new ListNode(1);
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(5);
		//ListNode b4 = new ListNode(6);
		b.next = b1;
		b1.next = b2;
		b2.next = b3;
		//b3.next = b4;
		subtract(b);
		while(b != null){
			System.out.println(b.val);
			b =b.next;	
		}

	}
	public static ListNode subtract(ListNode a) {
		ListNode head = a;
		int length = 0;
		while(head != null){
			length++;
			head = head.next;
		}
		ListNode bouncer = a;
		int counter,bounce_counter = 0;
		int half_length = length/2;
		for(int i = 0 ; i < half_length ; i++){
			head = a;
			bouncer = a;
			counter = i;
			bounce_counter = length-i-1;
			while(counter > 0){
				head = head.next;
				counter--;
			}
			while(bounce_counter > 0){
				bouncer = bouncer.next;
				bounce_counter--;
			}
			head.val = bouncer.val - head.val;
		}
		return a;
		
	}
}
