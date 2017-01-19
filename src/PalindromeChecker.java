
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("A man, a plama"));
		System.out.println(isPalindrome(".,"));

	}
	public static int isPalindrome(String a) {
		a = a.trim();
		String pattern= "^[a-zA-Z0-9]*$";
		if(a.length() == 0)
			return 0;
		int left = 0 ; int right = a.length()-1;
		while(left < right && left < a.length()/2){
			while(!a.substring(left,left+1).matches(pattern) && left < a.length()/2){
			//while((Integer.valueOf(a.charAt(left)) < 65 || Integer.valueOf(a.charAt(left)) > 122) && left < a.length()/2){
				left++;
			}
			while(!a.substring(right,right+1).matches(pattern) && right >0){
				right--;
			}
			if(left>=right)
				return 1;
			System.out.println(a.substring(left,left+1) + "   " + a.substring(right,right+1));
			if(!a.substring(left,left+1).equalsIgnoreCase(a.substring(right,right+1))){
				return 0;
			}
			else{
				left++;right--;
			}
		}
		return 1;
	}

}
