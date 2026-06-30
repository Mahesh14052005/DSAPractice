package arrays;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,2,3,2,4};
		int n=arr.length;
		int d=0;
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i]==arr[j]);
			}
		}

	}

}
