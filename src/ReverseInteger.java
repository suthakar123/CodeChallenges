
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2147483647
		System.out.println(reverse(-21477));

	}
	public static int reverse(int a) {
		boolean negative = false;
		if( a < 0 ){
			negative = true;
			a = -a;
		}
		if(a < 10 && a >0)
			return a;
		int digits = 0;
		StringBuffer str = new StringBuffer();
		int number = a;
		while(number > 0 ){
			str.append(String.valueOf(number%10));
			number/=10;
			++digits;
		}
		int reverse =0;
		try{
			reverse = Integer.valueOf(str.toString());
		}
		catch(Exception e){
			return 0;
		}
		if(negative)
			return -reverse;
		return reverse;
	}
}
