package ab56_inheritance;

public class GoogleProgram extends GoogleAuth
{
	static void mul()
	{
		
		System.out.println("Mul");

	}

	void div()
	{
		System.out.println("Div");

	}

	public static void main(String args[])
	{
		add();
		mul();
		GoogleProgram n1=new GoogleProgram();
		n1.div();
		n1.sub();
		
	}
}