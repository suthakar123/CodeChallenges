
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,3,12,2,5,7};
		quickSort(arr,0,arr.length-1);
		for(int i = 0 ; i < arr.length ; i++)
			System.out.println(arr[i]);
	}
	
	public static int partition(int[] arr,int start,int end){
		int pIndex = start;
		int temp=0;
		int pivot = arr[end];
		for(int i = start ; i < end ; i++){
			if(arr[i] <= pivot){
				temp =  arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
}
