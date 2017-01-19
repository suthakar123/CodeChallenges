
public class IntegerPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(11));

	}
	public static boolean isPalindrome(int a) {
		boolean result = false;
		if(a < 0)
			return false;
		if(a < 10)
			return true;
		int digits = 0;
		StringBuffer str = new StringBuffer();
		int number = a;
		while(number > 0 ){
			str.append(String.valueOf(number%10));
			number/=10;
			++digits;
		}
		System.out.println(str.toString());
		String s = String.valueOf(a);
		if(s.equalsIgnoreCase(str.toString()))
			return true;
		else
			return false;
	}

}
