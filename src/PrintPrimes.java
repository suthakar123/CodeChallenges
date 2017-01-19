import java.util.ArrayList;
import java.util.Collection;

public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_primes(10);
	}
	
	//sieve of erastothenes
	public static void print_primes(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 2 ; i < n ; i++){
			numbers.add(i);
		}
		for(int i = 0 ; i < Math.sqrt(numbers.size()) ; i++){
			for(int j = i+1 ; j < numbers.size() ;j++){
				if (numbers.get(j) != -1 && numbers.get(i)!= -1) {
					if (numbers.get(j) % numbers.get(i) == 0)
						numbers.set(j, -1);
				}
			}
		}
		for(int i = 0 ; i < numbers.size() ; i++){
			if(numbers.get(i) != -1)
			System.out.println(numbers.get(i));
		}
	}

}
