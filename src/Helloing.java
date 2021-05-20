
import java.util.Scanner;
public class Helloing {

	// 1- scan array from user with size
	// 2- initialize int value and array o[size] with -99 stored in them
	// 3- loop every item in array if item equal 10 set value as index of item
	//and add the index to array o
	// 4- if value is not -99 print the all o contents more than 0,
	//else print -1
	
	public static void main(String[] args) {
		int size = 0;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter array size");
		size = s1.nextInt();
		int [] k = new int[size];
		int [] o = new int[size];
		for(int i=0;i<size;i++) {
			o[i] = -99;
		}
		for(int i=0;i<size;i++) {
			System.out.println("Enter item in index "+i);
			k[i] = s1.nextInt();
		}
		
		int [] nums = findItem(k,o);
		if(nums[0] == -1) {System.out.println(-1);}
		else {
		System.out.println("value was found at " );
		for(int i=0;i<size;i++) {
			if(nums[i]!=-99)
			System.out.println(nums[i]);
		}
		}
	}
	
	public static int[] findItem(int [] arr,int [] store) {
		int value=-99;
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				value = i;
				store[j] = i;
				j++;
			}
		}
		
		if(value==-99) {store[0] = -1;}
		return store;
	}

}
