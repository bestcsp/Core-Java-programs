import java.util.Scanner;
class tarray
{
public static void main(String args[])
{
int array[][]=new int[10][10];
Scanner s=new Scanner(System.in);
int a,i,b,j;
System.out.println("how many row you want in an array");
a=s.nextInt();
System.out.println("how many column you want in an array");
b=s.nextInt();
System.out.println("start entering element");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
array[i][j]=s.nextInt();
}
System.out.println("Your Entered element are");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print(array[i][j]+" ");
}System.out.println("");}
}}
