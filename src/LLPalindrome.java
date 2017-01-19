
public class LLPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(1);
		ListNode input2 = new ListNode(6);
		ListNode input3 = new ListNode(4);
		ListNode input4 = new ListNode(1);
		//ListNode input5 = new ListNode(10);
		input.next = input1;
		input1.next = input2;
		input2.next = input3;
		input3.next = input4;
		//input4.next = input5;
		System.out.println(lPalin(input));

	}
	public static int lPalin(ListNode A) {
		int res = 0;
		
		if(A.next == null)
			return 1;
		if(A.next.next == null){
			if(A.val == A.next.val)
				return 1;
			else
				return 0;
		}
		ListNode temp = A;
		int count = 0;
		while(temp !=null){
			count++;
			temp = temp.next;
		}
		ListNode slow = A;
		ListNode fast = A;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow=slow.next;
		slow = ReverseLinkedList.reverseList(slow);
		while(slow !=null){
			if(slow.val != A.val)
				return 0;
			slow = slow.next;
			A = A.next;
		}
		return 1;
    }
}
