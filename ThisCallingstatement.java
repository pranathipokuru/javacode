package ab56_inheritance;

public class ThisCallingstatement //this is used for calling multiple constructors in same class
{

	ThisCallingstatement(int a)
	{
		System.out.println("constructor1");//control passes hare and this prints first

	}

	ThisCallingstatement(double a)
	{		
		this(3);//this will invoke above contructor
System.out.println("constructor2");

	}

	ThisCallingstatement(char a)
	{
		this (32.5);//this will invoke above constructor
		System.out.println("constructor3");

	}

	ThisCallingstatement()
	{
		this('P');// will invoke above consructor
       System.out.println("constructor4");
	}
	
public static void main(String args[])
{
	new ThisCallingstatement();// print this 1st?
}
}
