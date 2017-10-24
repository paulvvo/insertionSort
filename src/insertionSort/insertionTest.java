package insertionSort;
import java.util.*;


public class insertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array \n");
		int size = scan.nextInt();
		System.out.println("Enter the elements of the array");
		int[] unsortedArray = new int[size];
		while(k<size) {
			
			unsortedArray[k] = scan.nextInt();
			k++;		
		}
		
		
//		int[] unsortedArray;
//		unsortedArray = new int[] {2, 4, 3, 5,1,6, 21,4};	
		sort(unsortedArray);
		
		
	}
	public static void sort(int[] unsortedArray) {
		for(int i=1; i<unsortedArray.length;i++) {
		
			int valueHolder = unsortedArray[i];
			int positionHolder = i;
			
			while(positionHolder>0 && valueHolder<unsortedArray[positionHolder-1]) {
				unsortedArray[positionHolder] = unsortedArray[positionHolder-1];
				positionHolder--;
			}
			unsortedArray[positionHolder] = valueHolder;	
		}
		
		for(int j=0; j< unsortedArray.length; j++){
            System.out.print(unsortedArray[j] + " ");
		}

	
	}

}
