package ab56_inheritance;//
class Parent2
{
	Parent2(char a,String b)
	{
		
		System.out.println("Constructor1");
	}
	
}
class Parent1 extends Parent2
{
	Parent1(int a)
	{
		super('P',"pranathi");
		System.out.println("constructor2");
	}
	
}

public class SuperCallingStatement extends Parent1
{
	SuperCallingStatement()
	{
		super(67);
		System.out.println("Constructor3");
	}

	public static void main(String[] args) 
	{
		new SuperCallingStatement();
		
	}

}
