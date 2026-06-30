package arrays;

import java.util.Arrays;

public class InsertAnArray {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,3,9,2,47};
		int pos=3;
		int ele=88;
		int[] arr1=new int[arr.length+1];
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		arr1[pos]=ele;
		for(int i=pos+1;i<arr1.length;i++) {
			arr1[i]=arr[i-1];
		}
		
		System.out.println("After Inserting"+Arrays.toString(arr1));
		if(pos<arr.length && pos>=0) {
			arr[pos]=ele;
			System.out.println("Updated Array :"+Arrays.toString(arr));
		}else {
			System.out.println("Index Value is not valid");
		}
		
	}

}
