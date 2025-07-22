package ab56_inheritance;//example for hierarchial inheritance

class Parent
{
	void login()
	{
		System.out.println("Enter name and pwd");
	}
}

public class FirstChild extends Parent
{
	public static void main(String args[])
	{
		FirstChild h1=new FirstChild();
		h1.login();
		

	}

}
