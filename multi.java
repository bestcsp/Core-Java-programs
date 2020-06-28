import java.util.Scanner;
class grandparent
{

public void display()
{
System.out.println("Eye Color is Brown");
}
}
class parent extends grandparent
{
void display1()
{

System.out.println("Height is approx 6 Feet");
}
}
class child extends parent
{
void display2()
{
System.out.println("has all the features of grand parents ");
System.out.println("has all the features of parents ");
System.out.println("has its own features like Skin color");
}
}
class multi 
{
public static void main(String[] args)
{
child c=new child();
c.display();
c.display1();
c.display2();
}
}
