import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> x = new ArrayList<Integer>();
//		x.add(1);
//		x.add(1);
//		x.add(3);
//		x.add(3);
//		x.add(2);
//		x.add(4);
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(2);
		y.add(2);
		System.out.println(majorityElement(x));

	}
	public static int majorityElement(final List<Integer> a) {
		int ele = 0;
		if(a.size() == 1)
			return a.get(0);
		int majority = a.size()/2;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();int count = 0;
		for(int i : a){
			if(map.containsKey(i)){
				count = map.get(i);
				if(count == majority){
					return i;
				}
				map.put(i,count+1);
			}
			else map.put(i,1);		
		}
		return ele;
	}
}
