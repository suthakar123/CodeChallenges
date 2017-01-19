import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(1);
		x.add(3);
//		x.add(3);
//		x.add(2);
//		x.add(4);
		permute(x);

	}
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		int [] num = convertListToArray(a);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 
		//start from an empty list
		result.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
			//list of list in current iteration of the array num
			ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
	 
			for (ArrayList<Integer> l : result) {
				// # of locations to insert is largest index + 1
				for (int j = 0; j < l.size()+1; j++) {
					// + add num[i] to different locations
					l.add(j, num[i]);
	 
					ArrayList<Integer> temp = new ArrayList<Integer>(l);
					current.add(temp);
	 
					//System.out.println(temp);
	 
					// - remove num[i] add
					l.remove(j);
				}
			}
	 
			result = new ArrayList<ArrayList<Integer>>(current);
		}
		ArrayList<ArrayList<Integer>> d = removeDuplicates(result);
		return d;
		
	}
	public static int[] convertListToArray(ArrayList<Integer> num) {
		int[] n = new int[num.size()];
		for (int h = 0; h < num.size(); h++) {
			n[h] = num.get(h);
		}
		return n;
	}
	public static ArrayList<ArrayList<Integer>> removeDuplicates(ArrayList<ArrayList<Integer>> list){
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for(ArrayList<Integer> k : list){
			set.add(k);
		}
		for(ArrayList<Integer> s : set){
			l.add(s);
		}
		return l;
	}
}
