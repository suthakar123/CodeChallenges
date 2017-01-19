
public class AddLLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(9);
		ListNode input1 = new ListNode(9);
		ListNode input2 = new ListNode(9);
//		ListNode input3 = new ListNode(3);
//		ListNode input4 = new ListNode(3);
		//ListNode input5 = new ListNode(10);
		input.next = input1;
		input1.next = input2;
//		input2.next = input3;
//		input3.next = input4;
		ListNode b = new ListNode(1);
//		ListNode b1 = new ListNode(2);
//		ListNode b2 = new ListNode(4);
//		ListNode b3 = new ListNode(5);
//		ListNode b4 = new ListNode(6);
		//ListNode input5 = new ListNode(10);
//		b.next = b1;
//		b1.next = b2;
//		b2.next = b3;
//		b3.next = b4;
		//input4.next = input5;
		ListNode rest = addTwoNumbers(input, b);
		while(rest != null){
			System.out.println(rest.val);
			rest =rest.next;
			
		}

	}
	
	public static ListNode addTwoNumbers(ListNode a, ListNode b) {
		ListNode result = new ListNode(0);
		ListNode resultHead = result;
		if( a == null) return b;
		if(b == null) return a;
		boolean carry = false;
		int sum =0;
		while(a != null && b != null){
			if(carry) 
				sum = 1; 
			else sum = 0;
			sum += a.val + b.val;
			if(sum > 9){
				int r = sum % 10;
				carry = true;
				result.next = new ListNode(r);
				result = result.next;
				a = a.next;
				b = b.next;
			}
			else{
				carry = false;
				result.next = new ListNode(sum);
				result = result.next;
				a = a.next;
				b = b.next;
			}
		}
		if (a == null) {
			while (b != null) {
				if (carry) {
					sum = 1;
					sum += b.val;
					if (sum > 9) {
						int r = sum % 10;
						carry = true;
						result.next = new ListNode(r);
						result = result.next;
						
					}
					else{
						carry = false;
						result.next = new ListNode(sum);
						result = result.next;
					}
					b = b.next;
				}
				else{
					result.next = b;
					break;
				}
			}
		}
		else if ( b == null) {
			while (a != null) {
				if (carry) {
					sum = 1;
					sum += a.val;
					if (sum > 9) {
						int r = sum % 10;
						carry = true;
						result.next = new ListNode(r);
						result = result.next;
					}
					else{
						carry = false;
						result.next = new ListNode(sum);
						result = result.next;
					}
					a = a.next;
				}
				else{
					result.next = a;
					break;
				}
			}
		}
		if(carry == true) result.next = new ListNode(1);
		
		return resultHead.next;
	}

}
