import java.util.Scanner;
class student
{
String name;
int science;
int math;
void insert()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter name of student");
name=s.nextLine();
System.out.println("Enter value of math");
math=s.nextInt();
System.out.println("Enter value of Science");
science=s.nextInt();
}
void average()
{
int avg=(science+math)/2;
System.out.println("average of no. is "+avg);
}

}
	class s
	{
	public static void main(String args[])
	{
	student s=new student();
	for(int i=1;i<=3;i++)
	{
	s.insert();
	s.average();
	}
		}
	}