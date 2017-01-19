import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int isValidSudoku(final List<String> a) {
		int res = 0;
		HashMap<Integer,HashSet<Integer>> rowMap = new HashMap<Integer,HashSet<Integer>>();
		HashMap<Integer,HashSet<Integer>> colMap = new HashMap<Integer,HashSet<Integer>>();
		HashMap<Integer,HashSet<Integer>> boxMap = new HashMap<Integer,HashSet<Integer>>();
		for(int i = 0 ; i < 9 ; i++){
			for(int j = 0 ; j < 9 ; j++){
				if(a.get(i).charAt(j) == '.'){
					continue;
				}
				if(rowMap.containsKey(i)){
					if(rowMap.get(i).contains(a.get(i).charAt(j))){
						return 0;
					}
					else{
						rowMap.get(i).add(Integer.valueOf(a.get(i).charAt(j)));
					}
				}
				else{
					HashSet<Integer> set = new HashSet<Integer>();
					rowMap.put(i, set);
				}
				if(colMap.containsKey(j)){
					if(colMap.get(j).contains(a.get(i).charAt(j))){
						return 0;
					}
					else{
						colMap.get(j).add(Integer.valueOf(a.get(i).charAt(j)));
					}
				}
				else{
					HashSet<Integer> set = new HashSet<Integer>();
					colMap.put(j, set);
				}
				int box = calculateBox(i,j);
				if(boxMap.containsKey(box)){
					if(boxMap.get(box).contains(a.get(i).charAt(j))){
						return 0;
					}
					else{
						boxMap.get(box).add(Integer.valueOf(a.get(i).charAt(j)));
					}
				}
				else{
					HashSet<Integer> set = new HashSet<Integer>();
					boxMap.put(j, set);
				}
			}
		}
		return 1;
		
	}
	
	public static int calculateBox(int x, int y){
		if(x < 3){ 
			if(y < 3)
				return 0;
			if(y < 6)
				return 1;
			else
				return 2;
		}
		if(x < 6){ 
			if(y < 3)
				return 3;
			if(y < 6)
				return 4;
			else
				return 5;
		}
		else{ 
			if(y < 3)
				return 6;
			if(y < 6)
				return 7;
			else
				return 8;
		}
	}

}
