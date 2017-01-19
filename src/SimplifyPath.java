import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/./.././ykt/xhp/nka/eyo/blr/emm/xxm/fuv/bjg/./qbd/./../pir/dhu/./../../wrm/grm/ach/jsy/dic/ggz/smq/mhl/./../yte/hou/ucd/vnn/fpf/cnb/ouf/hqq/upz/akr/./pzo/../llb/./tud/olc/zns/fiv/./eeu/fex/rhi/pnm/../../kke/./eng/bow/uvz/jmz/hwb/./././ids/dwj/aqu/erf/./koz/.."
));

	}
	public static String simplifyPath(String a) {
		StringBuffer s = new StringBuffer();
		Stack<String> stack = new Stack<String>();
		StringBuffer current = new StringBuffer();
		boolean start = false;
		for(int i = 0 ; i < a.length() ; i++){
			if(a.charAt(i) == '/'){
				if(current.length() != 0){
					stack.push(current.toString());
					current = new StringBuffer();
					start = !start;
				}
				else{
					start = !start;
				}
			}
			else {current.append(a.charAt(i));}
		}
		if(current.length() != 0) stack.push(current.toString());
		int pop_count = 0;
		int cap = stack.capacity();
		Stack<String> rstack = new Stack<String>();
		while(!stack.isEmpty() && cap > 0){
			if(!stack.peek().equals("..") && !stack.peek().equals(".")){
				if(pop_count > 0){stack.pop();pop_count--;cap--;}
				else{
				cap--;rstack.push(stack.pop());}
			}
			if(!stack.isEmpty() && stack.peek().equals("..")){
				System.out.println("Inside");
				while(!stack.isEmpty()){
					if(!stack.peek().equals(".."))
						break;
					else{System.out.println("Inside .. pop");stack.pop();cap--;pop_count+=1;}
				}
			}
			else if(!stack.isEmpty() && stack.peek().equals(".")){
				stack.pop();cap--;
			}
		}
		while(!rstack.isEmpty()){
			s.append("/");
			s.append(rstack.pop());
		}
		if(s.length() == 0) return "/";
		return s.toString();
	}

}
