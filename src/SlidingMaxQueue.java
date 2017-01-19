import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SlidingMaxQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(3);
				input.add(-1);
				input.add(-3);
				input.add(5);
				input.add(3);
				input.add(6);
				input.add(7);
				ArrayList<Integer> rest = slidingMaximum(input,3);
				for(int i : rest)
					System.out.println(i);

	}
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int k) {
		int[] nums = new int[a.size()];
		ArrayList<Integer> max_list = new ArrayList<Integer>();
		for(int i = 0 ; i < a.size() ; i++){
			nums[i] = a.get(i);
		}
	 if(nums==null||nums.length==0)
	        return max_list;
	 
	    int[] result = new int[nums.length-k+1];
	 
	    LinkedList<Integer> deque = new LinkedList<Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
	            deque.poll();
	 
	        while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
	            deque.removeLast();
	        }    
	 
	        deque.offer(i);
	 
	        if(i+1>=k)
	            result[i+1-k]=nums[deque.peek()];
	    }
	    for(int i = 0 ; i < result.length ; i++){
	    	max_list.add(result[i]);
	    }
	    return max_list;
	}
}
