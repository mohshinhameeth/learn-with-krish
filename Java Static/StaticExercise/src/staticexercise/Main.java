package staticexercise;

//// * @author Muhsin
public class Main
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		//Test t2 = new Test();
	}
}
 class Test
{
	
	//static block
	static
	{
		System.out.println("Static block executed");
	}
	//empty block
	{
		System.out.println("Empty block executed");
	}
	//constructor
	Test()
	{
		System.out.println("Constructor executed");
	}
}