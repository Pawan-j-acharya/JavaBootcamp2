class C1		//Method Shadowing(with static keyword)
{
	public static void m1()
	{
		System.out.println("Hello");
	}
	
	public static void m2()
	{
		System.out.println("Hii");
	}
	
	public static void m3()
	{
		System.out.println("Hey");
	}
	
	public static void m4()
	{
		System.out.println("how are you? ");
	}
	
	public static void m5()
	{
		System.out.println("have a nice day ");
	}
}

class C2 extends C1
{
	public static void m1()
	{
		System.out.println("A");
	}
	
	public static void m2()
	{
		System.out.println("B");
	}
	
	public static void m3()
	{
		System.out.println("C");
	}
	
	public static void m4()
	{
		System.out.println("D");
	}
	
	public static void m5()
	{
		System.out.println("E");
	}
	
}

public class ClassDriver{
	public static void main(String[] args)
	{
		C2 x=new C2();					//(depend on LHS)
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		x.m5();

		C1 y=new C2();					//(depend on LHS)
		y.m1();
		y.m2();
		y.m3();
		y.m4();
		y.m5();

		
	}
}
	
		

