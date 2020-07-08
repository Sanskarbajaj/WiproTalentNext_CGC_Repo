package Arrayss;

public class TwoArraySizeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3};
		int brr[]=new int[] {4,5,6};
		int crr[]=new int[2];
		crr[0]=arr[1];
		crr[1]=brr[1];
		for(int x:crr)
		{
			System.out.println(x);
		}

	}

}
