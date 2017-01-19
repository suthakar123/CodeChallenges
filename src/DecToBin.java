
public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binary = dec_to_bin(4);
		System.out.println(binary);
	}
	
	public static String dec_to_bin(int n){
		String binary = "";
		while(n > 1){
			int r = n % 2;
			n = n/2;
			binary = binary.concat(Integer.toString(r));
		}
		binary = binary.concat(Integer.toString(n));
		String bin = "";
		for(int i = binary.length()-1 ; i >=0; i--)
			bin = bin.concat(String.valueOf(binary.charAt(i)));
		return bin;
	}

}
