import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class EvaluateExpn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		s.add("2");
		s.add("1");
		s.add("+");
		s.add("3");
		s.add("*");
		System.out.println(evalRPN(s));
	}
	public static int evalRPN(ArrayList<String> a) {
		HashMap<String,Integer> set = new HashMap<String,Integer>();
		set.put("+",0);
		set.put("-",1);
		set.put("*",2);
		set.put("/",3);
		Stack<String> stack = new Stack<String>();
		for (String i : a) {
			if (set.containsKey(i)) {
				int arg1 = Integer.valueOf(stack.pop());
				int arg2 = Integer.valueOf(stack.pop());
				int res2 = eval(arg2, arg1, set.get(i));
				stack.push(String.valueOf(res2));
			} else {
				stack.push(i);
			}
		}
		if(stack.isEmpty()) 
			return 0;
		else return Integer.valueOf(stack.pop());
	}
	
	public static int eval(int a, int b, int op){
		if(op == 0){return a+b;}
		if(op == 1){return a-b;}
		if(op == 2)return a*b;
		else{
			if(b==0)
				return Integer.MIN_VALUE;
			return a/b;	
			}
		}

}
