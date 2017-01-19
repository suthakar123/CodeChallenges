import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		//input.add(2);
		input.add(1);
		//input.add(4);
		//input.add(3);
		//input.add(2);
		
		System.out.println(kthsmallest(input, 1));

	}
	public static int kthsmallest(final List<Integer> a, int k) {
		int count =0;
		int small = Integer.MAX_VALUE;
		for(int i : a){
			if ( i <= small)
				small = i;
		}
		first:
		for(int i : a){
			count = 0;
			for (int j : a) {
				if (j <= i) {
					count++;
					if (count >= k) {
						if (i < small) {
							small = i;
							continue first;
						}
					}
				}
			}
			if(count >= k)
				return i;
		}
		return 0;
	}
}
