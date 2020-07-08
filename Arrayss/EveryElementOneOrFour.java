package Arrayss;

public class EveryElementOneOrFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,5,1};
	System.out.println(onfour(arr));
	}
	public static boolean onfour(int arr[])
	{
		boolean flag=false;
		for(int x:arr)
		{
			if(x!=1&&x!=4)
			{
				return false;
			}
			else
			{
				flag=true;
			}
		}
	return flag;}

}
