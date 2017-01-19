
public class strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("bbbbbbbbab","baba"));

	}
	public static int strStr(final String haystack, final String needle) {
		int index = -1;
		int nLength = needle.length();
		if(nLength == 0)
			return -1;
		int hLength = haystack.length();
		if(hLength == 0)
			return -1;
		if(nLength > hLength)
			return -1;
		for(int i = 0 ; i < hLength - nLength+1 ; i++){
			if(needle.charAt(0) == haystack.charAt(i)){
				int j = 1;
				for(; j < nLength ;j++){
					if(needle.charAt(j) != haystack.charAt(i+j)){
						break;
					}
				}
				if(j == nLength) return i;
			}
		}
		return index;
	}

}
