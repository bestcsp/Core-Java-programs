import java.util.Scanner;
class parents
{

public void display()
{
System.out.println("Eye Color is Brown");
}
}
class child1 extends parents
{
public void display1()
{
display();

System.out.println(" child -- Height is approx 6 Feet");
}
}
class child extends parents
{
void display2()
{
display();
System.out.println(" child1== has its own features like Skin color");
}
}
class heirachical 
{
public static void main(String[] args)
{
child c=new child();
child1 c1=new child1();
c1.display1();
c.display2();
}
}
