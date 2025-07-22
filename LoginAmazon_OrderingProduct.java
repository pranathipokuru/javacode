package ab56_inheritance;// example of multilevel inheritance
class Listenerclass//Grndparent class
{
    void Screenshot()
	{
		System.out.println("Print screentshot");

	}
}
class Baseclass extends Listenerclass//parent class
{
    void login()
	{
		System.out.println("enter name and pwd");
	}
}

public class LoginAmazon_OrderingProduct extends Baseclass//child class 
{
	void searchingAddingToCart()
	{
		System.out.println("product added to cart");
	}

	void makingPaymentusingUpi()
	{
		System.out.println("payment done");

	}

	public static void main(String args[])
	{
		LoginAmazon_OrderingProduct n1=new LoginAmazon_OrderingProduct();
		n1.login();// always create an object in child class as it can access both parent and grnadparent class
		n1.searchingAddingToCart();
		n1.makingPaymentusingUpi();
		n1.Screenshot();

	}
}
