import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrettyPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		ArrayList<ArrayList<Integer>> big = pretty_print(a);
		int dimension = 2*a-1 ;
		System.out.println();

	}
	
	public static ArrayList<ArrayList<Integer>> pretty_print(int a){
		int dimension = 2*a-1 ; //7
		int[] numbers = new int[a];
		for(int i = 0 ; i < a ; i++){
			numbers[i] = i+1;
		}
		ArrayList<ArrayList<Integer>> big_brother = new ArrayList<ArrayList<Integer>>();
		int[][] big_bro = new int[dimension][dimension];
		int[] arr = new int[dimension];
		if(a == 1){
			arr[0] = 1;;
			big_bro[0]=arr;
		}
		int step = 0;
		int[] prev_row = new int[dimension];
		for(int i = 0 ; i <= dimension/2 ; i++){
			//ArrayList<Integer> row = new ArrayList<Integer>(dimension);
			for(int j = 0 ; j < dimension ; j++){
				 big_bro[i][j] = prev_row[j];
				 big_bro[dimension - i-1][j] = prev_row[j];
			}
			System.out.println(step);
			for(int j = 0 + step ; j < dimension - step ; j++){
				big_bro[i][j] = a - step;
				big_bro[dimension - i-1][j] = a - step;
			}
			step++;
			for(int j = 0 ; j < dimension ; j++){
				prev_row[j] = big_bro[i][j];
				System.out.print(big_bro[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < dimension; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			Collections.sort(row);
			for (int j = 0; j < dimension; j++) {
				row.add(big_bro[i][j]);
			}
			big_brother.add(row);
		}
		return big_brother;
		
	}

}
