import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(3);
		input.add(-1);
		input.add(-3);
		input.add(5);
		input.add(3);
		input.add(6);
		input.add(7);
		ArrayList<Integer> rest = slidingMaximum(input,3);
		for(int i : rest)
			System.out.println(i);
	}
	
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		ArrayList<Integer> max_list = new ArrayList<Integer>();
		if(b > a.size()){
			b = a.size();
		}
		int[] arr = new int[b];
		for(int i = 0 ; i < b ; i++){
			arr[i] = a.get(i);
		}
		Arrays.sort(arr);
		int max = arr[b-1];
		max_list.add(max);
		for(int i = 0 ; i < a.size()-b ; i++){
				int target = a.get(i);int mid = (arr.length-1)/2; int low = 0; int high = arr.length-1;
				while(low <= high){
					mid = (low + high) /2;
					if(arr[mid] == target){
						break;
					}
					else if(arr[mid] > target){
						high = mid-1;
					}
					else{
						low = mid+1;
					}
				}
				arr[mid] = a.get(i+b);
				Arrays.sort(arr);
				max = arr[b-1];
				max_list.add(max);
		}
		return max_list;
	}

}
