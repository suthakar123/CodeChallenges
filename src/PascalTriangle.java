import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> rest = generate(7);
		for(ArrayList<Integer> l : rest){
			for(int i : l){
				System.out.print(i);
			}
			System.out.println();
		}

	}
	public static ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(1);
		result.add(one);
		for(int i = 1 ; i < a ; i++){
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.add(1);
			for(int j = 1 ; j < i ; j++){
				int c = result.get(i-1).get(j-1) + result.get(i-1).get(j);
				l.add(c);
			}
			l.add(1);
			result.add(l);	
		}
		return result;
	}

}
