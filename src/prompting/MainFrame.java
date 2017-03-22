package prompting;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn;
    static String content = "\nGREETINGS, THIS IS CS 3443 PROJECT FROM TEAM ONE:\n"   
    						+ "OUR HOPE AND DESIGN IS A SIMPLE BUT FUN TEXT ADVENTURE GAME WITH SELECT PICTURES AND MUSIC\n"
    						+ "YOUR GOAL IS SURIVIVE AND ESCAPE THE MYSTERIOUS MANSION. GOOD LUCK!\n"
    						+ "WOULD YOU LIKE TO PLAY A GAME?\n\nENTER YES TO CONTINUE\n";
    public MainFrame() {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        
        setLayout(new BorderLayout());
        
        JTextField textField1 = new JTextField("Enter your answer here: ");
        textField1.setVisible(true);
        textField1.setEditable(true);
        
        textArea = new JTextArea();
        textArea.setText(content);
        textArea.setEditable(false);
        textArea.setForeground(Color.GREEN);
        textArea.setBackground(Color.BLACK);
        textArea.setFont(new Font("Courier New", Font.ITALIC, 14));
        /*
        btn = new JButton("Click Me!");
        btn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		textArea.setText(null);
        		textArea.append("You pressed the button!\n\n");
        	}
        });
        */ 
        
        textField1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event)
        	{
        		System.out.println("Yeahg");
        		String string = "";
        		//user pressed Enter in JTextField textField1
        		if(event.getSource() == textField1){
        			System.out.println("user pressed enter\n");
        			string += event.getActionCommand();
        					if(string.toLowerCase().contains("yes".toLowerCase())){
			        			textArea.setText(null);
			        			textArea.append("So the game begins.\n... Can you survive the night?\n\n");
        					}        				
        		}//end if
        	}
        });
        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        //add(textField1, BorderLayout.SOUTH);
    }
}