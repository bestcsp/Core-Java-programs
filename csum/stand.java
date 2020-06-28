class parent
{
parent()
{
System.out.println("parent class\n");
}
void sum()
{
System.out.println("Hello parent class");
}
}
class child extends parent
{
child()
{
System.out.println("its child class");
}
void sum()
{
System.out.println("Hello child class");
}
}
class stand
{
public static void main(String args[])
{
parent d=new child();
child c=new child();
//parent p=new child();
d.sum();
System.out.println("dyanamic dispatch");
//p.sum();
//d=c;
//d.sum();
}
}