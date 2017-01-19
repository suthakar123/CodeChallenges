
public class LinkedListMergePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 // Definition for singly-linked list.
	  class ListNode {
	      public int val;
	      public ListNode next;
	      ListNode(int x) { val = x; next = null; }
	 }
	 
		public ListNode getIntersectionNode(ListNode a, ListNode b) {
			ListNode temp = a;
			int aLength = 0, bLength = 0;
			while(temp!= null){
				aLength++;
				temp = temp.next;
			}
			temp = b;
			while(temp!= null){
				bLength++;
				temp = temp.next;
			}
			if(aLength == 0 || bLength ==0){
				return null;
			}
			int merger = Math.abs(aLength - bLength);
			if(aLength > bLength){
				while(merger > 0){
					a = a.next;
					merger--;
				}
			}
			else{
				while(merger > 0){
					b = b.next;
					merger--;
				}
			}
			while(a != b){
			    if(a.next == null || b.next == null){
			        return null;
			    }
				a = a.next;
				b = b.next;
			}
			
			return a.next;
		}
}
