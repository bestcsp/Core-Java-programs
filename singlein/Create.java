import java.awt.Frame;
public class Create extends Frame{ 
	Create(String title){		
		//call the superclass constructor
		super();
		//set window title using setTitle method
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		Create window = 
				new Create("Create Window Example");		
		
	}
}