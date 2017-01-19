import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(0);
		input.add(0);
//		input.add(1);
//		input.add(3);
//		input.add(9);
//		input.add(9);
		ArrayList<Integer> rest = plusOne(input);
		for(int i : rest){
			System.out.println(i);
		}
	}
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = a.size()-1;
		boolean carry = true;
		while(carry == true && i>=0){
			int k;
			if(carry) k = a.get(i)+1;
			else k = a.get(i);
			if(k > 9){
				carry = true;
				a.set(i, 0);
			}
			else{
				carry = false;
				a.set(i, k);
			}
			i--;
		}
		if(carry) a.add(0, 1);
		i = 0;
		while(i < a.size()){
			if(a.get(i) == 0){
				a.remove(i);
			}
			else{
				break;
			}
		}
		return a;
	}
}
