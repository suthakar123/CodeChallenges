import java.util.ArrayList;
import java.util.List;

public class ArrayIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(4);
//		a.add(97);
//		a.add(98);
		a.add(200);
		ArrayList<Integer> b = new ArrayList<Integer>();
//		b.add(1);
//		b.add(3);
//		b.add(94);
//		b.add(94);
		b.add(200);
		ArrayList<Integer> rest = intersect(a, b);
		for(int i : rest)
			System.out.println(i);
		}

	public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
		ArrayList<Integer> iList = new ArrayList<Integer>();
		int j = 0; int i = 0;
		while( i < a.size() && j < b.size()){
			if(a.get(i)<b.get(j)){
				while(i < a.size() && a.get(i) < b.get(j)){
					i++;
				}
				if(i == a.size()) break;
			}
			else if(a.get(i)>b.get(j)){
				while(j < b.size() && b.get(j) < a.get(i)){
					j++;
				}
				if(j == b.size()) break;
			}
			if(a.get(i).equals(b.get(j))){
				iList.add(a.get(i));
				i++;j++;
			}
//			while(i+1 < a.size() && a.get(i+1) == a.get(i) ){
//				i++;	
//			}
//			while(j+1 < b.size() && b.get(j+1) == b.get(j) ){
//				j++;	
//			}
			
		}
		return iList;
	}

}
