package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,3,0,12};
		int j=0;
		int j1=0;
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[j1]=arr[i];
				j1++;	
			}else {
				j++;
			}
		}
		for(int i=j1;i<(j+j1);i++) {
			arr1[i]=0;
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
