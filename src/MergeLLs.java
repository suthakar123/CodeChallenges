
public class MergeLLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ListNode input = new ListNode(1);
				ListNode input1 = new ListNode(2);
				ListNode input2 = new ListNode(3);
				ListNode input3 = new ListNode(3);
				ListNode input4 = new ListNode(3);
				//ListNode input5 = new ListNode(10);
				input.next = input1;
				input1.next = input2;
				input2.next = input3;
				input3.next = input4;
				ListNode b = new ListNode(1);
				ListNode b1 = new ListNode(2);
				ListNode b2 = new ListNode(4);
				ListNode b3 = new ListNode(5);
				ListNode b4 = new ListNode(6);
				//ListNode input5 = new ListNode(10);
				b.next = b1;
				b1.next = b2;
				b2.next = b3;
				b3.next = b4;
				//input4.next = input5;
				ListNode rest = mergeTwoLists(null, b);
				System.out.println(rest.val+","+rest.next.val+","+rest.next.next.val);

	}
	public static ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode result = null;
		ListNode resultHead;
		if( a == null) return b;
		if(b == null) return a;
		if(a.val < b.val){
			resultHead = new ListNode(a.val);
			result = resultHead;
			a = a.next;
		}
		else { resultHead = new ListNode(b.val); result = resultHead; b = b.next;}
		while(a != null && b !=null){
			if(a.val < b.val){
				ListNode n = new ListNode(a.val);
				result.next = n;
				result = result.next;
				a = a.next;
			}
			else{
				ListNode n = new ListNode(b.val);
				result.next = n;
				result = result.next;
				b = b.next;
			}
		}
		if( a == null)
			result.next = b;
		else if( b == null)  result.next = a;
		return resultHead;
	}

}
