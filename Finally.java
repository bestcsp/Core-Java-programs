class Finally{  
public static void main(String[] args){  
try{  
int x=300;
System.out.println("value of x is"+x);  
}catch(Exception e){System.out.println(e);}  
finally{System.out.println("finally block is executed");}  
}} 