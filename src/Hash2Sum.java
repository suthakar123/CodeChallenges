import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(-10);
		b.add(-10);
		b.add(-10);
//		b.add(3);
//		b.add(3);
		ArrayList<Integer> r = twoSum(b,-5);
		for(int i : r){
			System.out.println(i);
		}

	}
	public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		HashMap<Integer,Integer> result_map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list;
		if(a.size() < 2){
			return result;
		}
		for(int i = 0 ; i < a.size() ; i++){
			if(!map.containsKey(a.get(i))){
				map.put(a.get(i), list = new ArrayList<Integer>());
				list.add(i);
			}
			else{
				list = map.get(a.get(i));
				list.add(i);
			}
		}
		for(int i = 0 ; i < a.size()-1 ; i++){
				if(map.containsKey(b - a.get(i))){
					list = map.get(b-a.get(i));
					for(int k : list){
						if(k > i){
							if(!result_map.containsKey(k+1))
								result_map.put(k+1, i+1);
						}
					}
					
				}
		}
		int small = Integer.MAX_VALUE;
		if (!result_map.keySet().isEmpty()) {
			for (int i : result_map.keySet()) {
				if (i < small) {
					small = i;
				}
			}
			result.add(result_map.get(small));
			result.add(small);
		}
		return result;
	}
}
