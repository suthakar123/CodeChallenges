import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(singleNumber(list));

	}
	public static int singleNumber(final List<Integer> a) {
		int checker = -1;
		for(int i = 0 ; i < a.size()-1 ; i++){
			checker = a.get(i)^a.get(i+1);
		}
		return checker;
	}
}
