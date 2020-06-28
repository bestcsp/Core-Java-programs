import java.util.Scanner;
class carray
{
public static void main(String args[])
{
char array[]=new char[10];
Scanner s=new Scanner(System.in);
int a,i;
System.out.println("how many elements you want in an array");
a=s.nextInt();
System.out.println("start entering characters");
for(i=0;i<a;i++)
{
char c=s.next().charAt(0);
array[i]=c;
}
System.out.println("Your Entered element are");
for(i=0;i<a;i++)
{
System.out.println(array[i]);
}
}}
