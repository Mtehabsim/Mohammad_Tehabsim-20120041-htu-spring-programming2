package htu;

public class InLab {

	public static void main(String[] args) {
		int arr[] = {1,1,5,2,3,8};
	System.out.println(fibonaci(arr));

	}
	
	public static int fibonaci(int arr[]) {
		
		for(int x=1;x<arr.length;x++){ //sort
		    for(int indexx=0;indexx<=x;indexx++){
		        if(arr[x]<arr[indexx]){
		            int temp = arr[indexx];
		            arr[indexx]=arr[x];
		            arr[x]=temp;
		}}}
		
		int check = 1;
		for(int i=2;i<arr.length;i++) { //check if fibonaci
			if(arr[i]==arr[i-1]+arr[i-2]) {
				
			}
			else {
				check = 0;
				return 0;
			}
		}
		if(check==1) {return 1;}
		else {return 0;}
	}
}
