import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int threeSumClosest(ArrayList<Integer> a, int b) {
		int result = 0;
		int[] arr = new int[a.size()];
		for(int i = 0 ; i < a.size() ; i++){
			arr[i] = a.get(i);
		}
		int j = 0, k = 0;
		Arrays.sort(arr);
		int diff = Integer.MAX_VALUE;
		int current; int current_sum;
		for(int i = 0 ; i < arr.length ; i++){
			j = i+1;
			k = arr.length -1;
			while(j < k){
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == b)
					return sum;
				current = Math.abs(sum -b);
				if(current < diff){
					diff = current;
					current_sum = sum;
				}
				if(sum < b){
					j++;
				}
				else{
					k--;
				}
				
			}
		}
		return diff;
	}
}
