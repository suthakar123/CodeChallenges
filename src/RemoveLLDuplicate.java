
public class RemoveLLDuplicate {

	public static void main(String[] args) {
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
		//input4.next = input5;
		ListNode rest = deleteDuplicates(input);
		System.out.println(rest.val+","+rest.next.val+","+rest.next.next.val);
		//System.out.println(rest.val+","+rest.next.val);

	}
	public static ListNode deleteDuplicates(ListNode a) {
		if( a == null)
			return null;
		if( a.next == null)
			return a;
		ListNode temp = null, node = null, first = a;
		node = a;
		while(node.next !=null){
			if(node.val == node.next.val){
				node = node.next;
			}
			else{
				first.next = node.next;
				first = node.next;
				node = node.next;
			}
		}
		first.next = null;
		return a;
	}

}
