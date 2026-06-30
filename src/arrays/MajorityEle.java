package arrays;

public class MajorityEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,3,3,3,3,2,2,2,2,3};
		int m=0;
		for(int i=0;i<arr.length-1;i++) {
			int c=1;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>(arr.length/2)) {
				m=arr[i];
			}
		}
		System.out.println("Majority Element is :"+m);

	}

}
