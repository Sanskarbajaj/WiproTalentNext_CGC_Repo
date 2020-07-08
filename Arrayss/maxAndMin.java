package Arrayss;

public class maxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {54, 24, -4, 0, 2, 45, 54, -9, 7,01,11,22,33,11,};		 
		  
		    int max = arr[0];
		    int min = arr[0];
		   
		    for(int i = 1; i < arr.length; i++){
		      if(max < arr[i]){
		        max = arr[i];
		      }else if(min > arr[i]){
		        min = arr[i];
		      }		   		   
		    }
		    System.out.println("Max number = " 
		         + max + " Min number = " + min);		
	}

}
