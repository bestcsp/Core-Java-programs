class Finalizex { 
    public static void main(String[] args) 
    { 
        Finalizex s = new Finalizex(); 
        s = null; 
        System.gc(); 
        System.out.println("Main Completes"); 
    }  
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 
} 