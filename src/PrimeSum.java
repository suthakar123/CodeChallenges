import java.util.ArrayList;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = primesum(4);
		for(int i = 0 ; i < ans.size(); i++){
			System.out.println(ans.get(i));
		}

	}
	public static ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> prime_sum = new ArrayList<Integer>();
		ArrayList<Integer> primes = print_primes(a);
		for(int i = 0 ; i <= a/2 ; i++){
			if(primes.contains(a - primes.get(i))){
				prime_sum.add(0,primes.get(i));
				prime_sum.add(1,a - primes.get(i));
				return prime_sum;
			}
		}
		return prime_sum;
		
	}
	public static ArrayList<Integer> print_primes(int n){
		int[] primes = new int[n+1];
		for(int i = 0 ; i <= n ; i++){
			primes[i] =1;
		}
		primes[0] = 0;
		primes[1] = 0;
		for(int i = 0 ; i < Math.sqrt(n) ; i++){
			if(primes[i] ==1){
				for(int j = 2; i*j < n ; j++){
					primes[i*j] = 0;
				}
			}
		}
		ArrayList<Integer> prime_numbers = new ArrayList<Integer>();
		for(int i = 0 ; i < primes.length ; i++){
			if(primes[i] == 1)
				prime_numbers.add(i);
		}
		return prime_numbers;
	}

}
