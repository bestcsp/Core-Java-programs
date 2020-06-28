class top
{
	int a=100;
	void m1()
	{ 
		System.out.println("m1 in top");
	}
	static void m2()
	{
		System.out.println("m2 in top");
	}
}
class bottom extends top
{   
        int a=500;

	static void m2()
	{
	
		System.out.println("m2 in bottom");
	}
	void m3()
	{   
		System.out.println("m3 in bottom");
	}
}
class inherit
{
	public static void main(String a[])
	{
	top b1=new bottom();
		b1.m1();//inherit
		b1.m2();//override
		System.out.println(b1.a);//extends
	}
}