
public class BinarySearchSQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(20));
	}
	
	public static int sqrt(int a) {
		if ( a == 0)
			return 0;
		if ( a == 1)
			return 1;
		int low = 1; 
		int high = a;
		int mid = 1;
		int root =0;
		while (low <=high) {
			mid = (low+high) /2;
			if(mid == a/mid)
				return mid;
			else if(mid <= a/mid)
			{
				root = mid;
				low = mid +1;
			}
			else{

				high = mid -1;
			}
		}
		return root;
		
	}

}
