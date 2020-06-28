class Person
{
void walk()
{
System.out.println("Can Run....");
}
}
class polymorphism extends Person
{
void walk()
{
System.out.println("Running Fast... csp");
}
public static void main(String arg[])
{
polymorphism p=new polymorphism(); //upcasting
p.walk();
}
}