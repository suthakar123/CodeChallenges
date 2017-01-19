import java.util.Stack;

public class LLSubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode b = new ListNode(1);
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(5);
		ListNode b4 = new ListNode(6);
		b.next = b1;
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		subtract(b);
		while(b != null){
			System.out.println(b.val);
			b =b.next;	
		}

	}
	public static ListNode subtract(ListNode a) {
		//ListNode rest = a;
		subtract_helper(a,a);
		return a;
	}
	public static ListNode subtract_helper(ListNode a, ListNode curr){
		if(curr.next == null){
			a.val = curr.val - a.val;
			return a.next;
		}
		else{
			ListNode k = subtract_helper(a,curr.next);
			if(k == null || k.next==null)
				return null;
			if(k == curr)
				return null;
			if(k.next == curr){
				k.val = curr.val - k.val;
				return null;
			}
			k.val = curr.val - k.val;
			return k.next;
		}
	}

}
