package ab56_inheritance;// method overriding using super keyword
class Superclass2
{
	void login()// overridden method
	{
		System.out.println("login with OTP");
	}
	
}
class Superclass extends Superclass2
{
	void login()// overridden method
	{
		System.out.println("login with email");
		super.login();//super keyword to call the parent class implementation 
	}
}
public class Subclass extends Superclass
{
	void login()
	{
		
		System.out.println("login with mobile no.");
		super.login();
	}
	
	public static void main(String args[])
	{
		Subclass s1=new Subclass();
		s1.login();
	}

}
