package prompting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class promptController implements ActionListener {

	private promptModel model;
	
	private promptView view;
	//public CalculatorController(CalculatorModel model, CalculatorView view) 
	public promptController(promptModel model,promptView view) {
		this.model = model;
		this.view = view;
		
		
	}
	
	//needs work
	public void actionPerformed(ActionEvent event)
	{		
		String command = event.getActionCommand();
		System.out.println("This is button press crap! : " + command);
		view.update("hello there Jesse");
		
	}

}
