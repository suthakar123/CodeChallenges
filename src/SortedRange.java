import java.util.ArrayList;
import java.util.List;

public class SortedRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(1);input.add(2);
		input.add(5);
		input.add(5);
		input.add(5);
		input.add(9);
		
		ArrayList<Integer> result = searchRange(input,7);
		for(int i : result){
			System.out.println(i);
		}

	}
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> range = new ArrayList<Integer>();
		int low =0, high = a.size()-1, mid;
		int left =0,right=0;
		while(low<=high){
			mid = (low + high)/2;
			if(a.get(mid) == b){
				left = mid;right=mid;
//				while(left-1 >= 0 && a.get(left-1) == b ){
//					--left;
//				}
//				while( right+1 <= a.size()-1 && a.get(right+1) == b){
//					++right;
//				}
				
				range.add(left);
				range.add(right);
				return range;
			}
			else if(a.get(mid)> b){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		if(low > high){
			range.add(-1);
			range.add(-1);
		}
		
		
		return range;
	}

}
