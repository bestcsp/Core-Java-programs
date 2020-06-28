class Finalize1{  
public void finalize(){System.out.println("finalize called");}  
public static void main(String[] args){  
Finalize1 f1=new Finalize1();  
Finalize1 f2=new Finalize1();  
f1=null;  
f2=null;  
System.gc();  
}}