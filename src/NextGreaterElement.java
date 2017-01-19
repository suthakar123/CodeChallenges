import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(3);
		b.add(9);
		b.add(1);
		b.add(3);
		ArrayList<Integer> r = nextGreater(b);
		for(int i : r){
			System.out.println(i);
		}

	}
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
		ArrayList<Integer> rest = new ArrayList<Integer>(a.size());
		for(int i = 0 ; i < a.size() ; i++){
			rest.add(-1);
		}
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int next;
		for(int i = 1 ; i < a.size() ; i++){
			next = a.get(i);
			while(!stack.isEmpty() && a.get(stack.peek()) < next){
				int n = stack.pop();
				rest.set(n,next);
			}
			stack.push(i);
		}
		int temp;
		while(!stack.isEmpty()){
			temp = stack.pop();
			rest.set(temp, -1);
		}
		return rest;
	}

}
