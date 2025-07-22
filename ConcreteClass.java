package ab56_inheritance;
abstract class AbstractClass// 50% abstraction
{
	void add()//concrete method 1
	{
		System.out.println("the logic1 is not hidden");
	}
	void sub()//concrete method 2
	{
		System.out.println("the logic2 is not hidden");

	}
	abstract void mul();//abstract menthod1
	abstract void div();//abstract method2
	
}

public class ConcreteClass extends AbstractClass
{
    void mod()
    {
    	System.out.println("the logic is hidden");
    }
    public static void main(String args[])
  {
    	ConcreteClass c1=new ConcreteClass();
    	 c1.mod();
    	c1.add();
    	c1.sub();
  }
    	void mul() 
	{
    	System.out.println("the logic is hidden");

	}

	void div() 
	{
    	System.out.println("the logic is hidden");

	}
  }
