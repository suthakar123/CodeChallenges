
public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("sadfsa fasdfsa f sa df   "));

	}
	
	public static int lengthOfLastWord(final String a) {
		int result =0;
		StringBuffer word = new StringBuffer();
		int flag = 0;
		for( int i = a.length()-1 ; i >= 0 ; i--){
			if(a.charAt(i) == ' '){
				if(flag == 1)
					break;
				continue;
			}
			else{
				flag = 1;
				word.append(a.charAt(i));
			}
		}
		if(word.toString() != null)
			return word.length();
		else
			return 0;
	}

}
