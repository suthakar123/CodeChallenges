import java.util.ArrayList;

public class ArrayMinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(1);
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(2);
		y.add(2);
		System.out.println(coverPoints(x,y));

	}
	public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int steps = 0;
		if(X.size() != Y.size()){
			return 0;
		}
		int x1,y1,x2,y2,xd,yd;
		for(int i = 0 ; i < X.size()-1 ; i++){
			x1 = X.get(i);
			y1 = Y.get(i);
			x2 = X.get(i+1);
			y2 = Y.get(i+1);
			xd = Math.abs(x1-x2);
			yd = Math.abs(y1-y2);
			int big = xd>yd?xd:yd;
			int small = xd>yd?yd:xd;
			while(small > 0){
				steps++;
				big--; small--;
			}
			while(big > 0){
				steps++;
				big--;
			}
		}
		return steps;
    }

}
