package Lecture1_Strings;

public class PrintOrntdUsingIndexOfFn {

	public static void main(String[] args) {
		String str=new String("Object Oriented Programming");
		String resString="Oriented";
		getind(str,resString);

	}
	public static void getind(String source,String target)
	{
		int ind=source.indexOf(target);
		int sizeOfTarget=target.length();
		System.out.println(source.substring(ind,sizeOfTarget+ind));
		
	}

}
