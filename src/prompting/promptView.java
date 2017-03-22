package prompting;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
public class promptView extends JFrame {
	
	private JTextArea textArea;
    private JButton btn;
    
    //might need string to be in model and not view 
    private String content = "\nGREETINGS, THIS IS CS 3443 PROJECT FROM TEAM ONE:\n"   
    						+ "OUR HOPE AND DESIGN IS A SIMPLE BUT FUN TEXT ADVENTURE GAME WITH SELECT PICTURES AND MUSIC\n"
    						+ "YOUR GOAL IS SURIVIVE AND ESCAPE THE MYSTERIOUS MANSION. GOOD LUCK!\n"
    						+ "WOULD YOU LIKE TO PLAY A GAME?\n\nPRESS BUTTON TO CONTINUE\n";
    
    public promptView() {
    	super("This is view");
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        
        setLayout(new BorderLayout());
        
    	
        //JTextField textField1 = new JTextField("Enter your answer here: ");
        //textField1.setVisible(true);
        //textField1.setEditable(true);
        btn = new JButton("button1");
        
        textArea = new JTextArea();
        textArea.setText(content);
        textArea.setEditable(false);
        textArea.setForeground(Color.GREEN);
        textArea.setBackground(Color.BLACK);
        textArea.setFont(new Font("Courier New", Font.ITALIC, 14));
        
        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        //add(textField1, BorderLayout.SOUTH);

    }
    

	public void registerListener(promptController controller) {
		// someComponent.addActionListener(instanceOfMyClass);
		//textField1.addActionListener(controller);
		btn.addActionListener(controller);
		
	}//end registerListener method 

	//update textArea function.
	public void update(String value) 
	{
		System.out.println("Passed string is : " + value);
		textArea.setText(null);
		textArea.append("So the game begins.\n... Can you survive the night?\n\n");
	}//end method update
}
