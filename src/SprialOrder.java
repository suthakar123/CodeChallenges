import java.util.ArrayList;
import java.util.List;

public class SprialOrder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
		List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i < 3 ; i++){
			ArrayList<Integer> row = new ArrayList<Integer>(4);
			row.add(1);
			row.add(2);
			row.add(3);
			row.add(4);
			a.add(row);
		}
		ArrayList<Integer> row = spiralOrder(a);
		System.out.println("Printing K : ");
		for (int k : row) {
			System.out.print(k);
		}
		 
	}
	
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 if(a.size() == 1){
			 return a.get(0);
		 }
		 if(a.get(0).size() == 1){
			 for(int i = 0 ; i < a.size() ; i++){
				 result.add(a.get(i).get(0));
			 }
		 }
		 int[][] input = new int[a.size()][a.get(0).size()];
		 int i = 0 , j = 0 ;
		 for ( ArrayList<Integer> row : a){
			 j = 0;
			 for ( int k : row){
				 System.out.println("i :" + i);
				 System.out.println("j :" + j);
				 System.out.println("k :" + k);
				 input[i][j] = k;
				 j++;
			 }
			 i++;
		 }
		 int m = input.length;
		 int n = input[0].length;
		 int dir = 0; // 0 - right , 1 - down , 2 - left , 3 - up
		 int l = 0 , r = input[0].length-1 , t = 0 , b = input.length-1; 
		 int size = m * n;
		 int count = 0;
		while (count <= size ) {
			if (dir == 0) {
				for(int z = l ; z <= r ; z++){
					result.add(input[t][z]);
					++count;
					
				}
				dir = 1;
				t++;
			}
			if (dir == 1) {
				for(int z = t ; z <= b ; z++){
					result.add(input[z][r]);
					++count;
				}
				dir = 2;
				r--;
			}
			if (dir == 2) {
				for(int z = r ; z >= l ; z--){
					result.add(input[b][z]);
					++count;
					
				}
				dir = 3;
				b--;
			}
			if (dir == 3) {
				for(int z = b ; z >= t ; z--){
					result.add(input[z][l]);
					++count;
				}
				dir = 0;
				l++;
			}
		 }
		 
		 
		 // Populate result;
		 return result;
}
}
