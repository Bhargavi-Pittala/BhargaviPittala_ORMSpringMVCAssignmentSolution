
public class LinearSearchImpl {

	
	
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
		int size = arr.length;
		 int position = linearSearch(arr,keyElement,size);
		 
		 if(position == -1) {
			 System.out.println("Element  not found" );
			 	 {
				 System.out.println("Element found" + position);
			 }
		 }
	}
	
}
