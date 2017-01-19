
public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(6);
		ListNode input3 = new ListNode(4);
		ListNode input4 = new ListNode(5);
		//ListNode input5 = new ListNode(10);
		input.next = input1;
		input1.next = input2;
		input2.next = input3;
		input3.next = input4;
		//input4.next = input5;;
		ListNode rest = rotateRight(input,7);
		System.out.println(rest.val+","+rest.next.val);

	}
	
	public static ListNode rotateRight(ListNode a, int b) {
		ListNode node = null;
		ListNode temp = a;
		int aLength = 0;
		while(temp!= null){
			aLength++;
			temp = temp.next;
		}
		temp = a;
		if(b >= aLength){
			b = b % aLength;
			if(b == 0)
				return temp;
		}
		int severence = aLength - b-1;
		for(int i = 0 ; i < severence ; i++){
			a = a.next;
		}
		node = a.next;
		ListNode temp_node = node;
		while(temp_node.next!= null){
			temp_node = temp_node.next;
		}
		temp_node.next = temp;
		a.next = null;
		return node;
	}

}
