
public class BitReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arg = 4;
		System.out.println(reverse(4));

	}
	public static long reverse(long a) {
		long reverse = 0;
		for (int i = 0 ; i < 32 ; i++){
			reverse <<= 1;
			if((a & (1 << i)) !=0){
				reverse |=1;
			}
		}
		return reverse;
	}
	}

