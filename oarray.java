import java.util.Scanner;
class oarray
{
public static void main(String args[])
{
int array[]=new int[10];
Scanner s=new Scanner(System.in);
int a,i;
System.out.println("how many elements you want in an array");
a=s.nextInt();
System.out.println("start entering element");
for(i=0;i<a;i++)
{
array[i]=s.nextInt();
}
System.out.println("Your Entered element are");
for(i=0;i<a;i++)
{
System.out.println(array[i]);
}
}}
