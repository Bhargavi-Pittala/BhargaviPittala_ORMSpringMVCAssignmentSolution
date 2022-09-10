package first;

public class LinearSearch {
public static int linearSearch(int[] array, int key,int size) {
		
		for(int i =0; i < size;i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		
		
		int[] arr = {1,2,3,4};
		int keyElement = 3;
		int size = 4;
		int result= linearSearch(arr,keyElement,size);
		 
		
		 System.out.print(result);
	}
}
