import java.util.Scanner;
class parent
{
int a=5;
public void display()
{
System.out.println("no. is "+a);
}
}
class child extends parent
{
int b=11;
void sum()
{
int c=a+b;
System.out.println("sum of no. is "+c);
}
}
class single 
{
public static void main(String[] args)
{
child c=new child();
c.sum();
}}
