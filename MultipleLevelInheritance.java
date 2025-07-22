package ab56_inheritance;
interface A
{
	void add();
	void sub();
	
}
interface B
{
	void mul();
	void div();
}

public class MultipleLevelInheritance implements A,B
{
	public static void main(String args[])
	{
		MultipleLevelInheritance m1=new MultipleLevelInheritance();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		
	}
    public void mul() 
	{
		System.out.println("the logic for mul is hidden");
	}
    public void div() 
	{
		System.out.println("the logic for div is hidden");

	}
    public void add() 
	{
		System.out.println("the logic for add is hidden");

	}
    public void sub() 
	{
		System.out.println("the logic for sub is hidden");

	}
	
}
