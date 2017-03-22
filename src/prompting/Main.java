package prompting;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {
	/*
	 * simple main method that calls other methods/classes to create GUI
	 * WHICH do you like better? 
	 */
   public static void  main(String[] args) 
   {

	   promptModel model = new promptModel();
	   promptView view = new promptView();
	   promptController controller = new promptController(model, view);
	   
	   //register crap 
	   view.registerListener(controller);
	   
	   //set crap for view shit 
	   view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   view.setVisible(true);
	   view.setSize(800, 600);
       view.setLayout(new BorderLayout());
	   
   }//end main method
   
}//end Class Main(name of class)
