
public class OneBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arg = 0;
		System.out.println(numSetBits(arg));

	}
	public static int numSetBits(long a) {
		int count = 0;
		long one = 1;
		while(a > 0){
			if((a & one) == 1){
				count++;
			}
			a = a >> 1;
		}
		return count;
	}
}
