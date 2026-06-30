package arrays;

import java.util.Arrays;

public class DeleteSpesificIndex {
	public static void main(String[] args) {
		int[] arr= {1,8,3,9,2,47};
		int pos=3;
		int[] arr1=new int[arr.length-1];
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		for(int i=pos+1;i<arr.length;i++) {
			arr1[i-1]=arr[i];
		}
		System.out.println("Before Delete :"+Arrays.toString(arr));
		System.out.println("After Delete :"+Arrays.toString(arr1));

	 }
}
