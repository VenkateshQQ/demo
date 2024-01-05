package practise;
public class ArraysPractice {
	public static void main(String[] args) {
		int[] arr1=new int[5]; // array declaration: we need to set the length of the array at the time of declaration.
//		int[] arr2= {1,2,3,4,5}; we can delcare the array like this also.
		arr1[0]=10;
		arr1[1]=30;
		arr1[2]=40;
		arr1[3]=70;
		arr1[4]=90;
//		System.out.println(arr1.length);
		for(int i=0; i<arr1.length; i++) {
			// we dont know the array length in realtime, so we use i<arr1.length to for loop condition.
			System.out.println("value at index "+i+" is: "+arr1[i]);
		}
	}
}
