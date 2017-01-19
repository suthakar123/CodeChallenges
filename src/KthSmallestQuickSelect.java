import java.util.List;

public class KthSmallestQuickSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{ 68, 60, 92, 36, 12, 61, 80, 39, 53, 39, 25, 6, 87, 65, 6, 88, 80, 6, 75, 97, 4, 76, 75, 73, 96, 73, 32, 6, 81, 50, 43, 40, 49, 3, 9, 74, 29, 15, 40};
		System.out.println(arr.length);
		System.out.println(quickSelect(arr,0,arr.length-1,39));
	}
	
	public static int kthsmallest(final List<Integer> a, int k){
		int[] arr = new int[a.size()];
		for(int i=0 ; i < a.size(); i++){
			arr[i] = a.get(i);
		}
		System.out.println(arr.length);
		return quickSelect(arr,0,arr.length-1,k);
	}
	
	public static int quickSelect(int[] arr,int start, int end,int k){
			if(start == end)
				return arr[start];
			int pivot = partition(arr,start,end);
			if(k == pivot){
				return arr[pivot-1];
			}
			else if (k < pivot){
				return quickSelect(arr,start,pivot-1,k);
			}
			else{
				return quickSelect(arr,pivot+1,end,k);
			}
	}
	public static int partition(int[] arr, int start, int end){
		//System.out.println("start :"+start);
		//System.out.println("end :"+end);
		int pIndex = start;
		int pivot = arr[end];
		int temp = 0;
		for(int i = start ; i < end ;i++){
			if(arr[i] < pivot){
				temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex++;
			}
		}
		temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		//System.out.println("Pivot :"+pIndex);
		return pIndex;
	}

}
