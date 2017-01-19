import java.util.HashMap;
import java.util.Stack;

public class BalanceParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int isValid(String a) {
		int result = 0;
		Stack<String> stack = new Stack<String>();
		HashMap<String,String> map = new HashMap<String,String>();
		map.put(")", "(");
		map.put("}", "{");
		map.put("]", "[");
		for(int i = 0 ; i < a.length() ; i++){
			if(a.charAt(i) == '(' || a.charAt(i) == '{' || a.charAt(i) == '['){
				stack.push(String.valueOf(a.charAt(i)));
			}
			if(a.charAt(i) == ')' || a.charAt(i) == '}' || a.charAt(i) == ']'){
				if(!map.get(String.valueOf(a.charAt(i))).equals(stack.pop())){
					return 0;
				}
			}
		}
		return stack.isEmpty()?1:0;
	}
}
