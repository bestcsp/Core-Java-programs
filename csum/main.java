class top
{
 void m1()
 {
 System.out.println("control in TOP");
 }
}
class bottom extends top
{
	void m1()
	{
		//super.m1();
		System.out.println("control in BoTTOM");
	}
}
class main
{
	public static void main(String s[])
	{
		top t1 =new bottom();
		t1.m1();
	}
}