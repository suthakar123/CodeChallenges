import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = new ArrayList<String>();
		input.add("rat");
		input.add("tar");
		input.add("rot");
		ArrayList<ArrayList<Integer>> rest =  new ArrayList<ArrayList<Integer>>();
		rest = anagrams(input);
		for(ArrayList<Integer> k : rest){
			for(Integer i : k){
				System.out.print(i);
			}
			System.out.println();
		}

	}
	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		int[] checker = new int[26];
		for(int k = 0 ; k < checker.length ; k++){
			checker[k] = 0;
		}
		StringBuffer s = new StringBuffer();
		for(int k = 0 ; k < checker.length ; k++){
			s.append(checker[k]);
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int j = 0 ; j < a.size() ;j++){
			for(int k = 0 ; k < checker.length ; k++){
				checker[k] = 0;
			}
			for(int i = 0 ; i < a.get(j).length() ; i++){
				checker[a.get(j).charAt(i)-'a']++;	
			}
			s = new StringBuffer();
			for(int k = 0 ; k < checker.length ; k++){
				s.append(checker[k]);
			}
			if (map.containsKey(s.toString())) {
				l = map.get(s.toString());
				l.add(j+1);
			} else {
				l = new ArrayList<Integer>();
				l.add(j+1);
				map.put(s.toString(), l);
			}	
		}
		for(String i : map.keySet()){
			if(map.get(i).size() > 0){
				result.add(map.get(i));
			}
		}
		return result;
	}

}
