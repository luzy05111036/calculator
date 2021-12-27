package lab12;

import java.awt.event.*;
import javax.swing.*; 
import java.awt.*; 

public class Calculator  {
	
	private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtEqual;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtClear;
    private JButton jbtDot;
    private JButton jbtSqr;
    private double TEMP;
    private double SolveTEMP;
    private JTextField result;
    private JTextField result1;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;
    Boolean SqutBool = false;

    String display = "";
    String display1 = "";
	
	
	 public Calculator(){
	         
		 // results panel p2 
			 JPanel p2 = new JPanel();
			 p2.setBackground(new Color(173,216,230));
			 result = new JTextField(5);
		        result.setHorizontalAlignment(JTextField.RIGHT);
		        result.setFont(new Font("Apple Casual", Font.BOLD, 15));
		        result.setEditable(false);
		        result.setBackground(new Color(255,255,255));
		
			 result1 = new JTextField();
			    
			    result1.setOpaque(true);
			   
		        result1.setHorizontalAlignment(JTextField.RIGHT);
		        result1.setPreferredSize(new Dimension(200, 40));
		        result1.setFont(new Font("Apple Casual", Font.BOLD, 15));
		        result1.setEditable(false);
		        result1.setBackground(new Color(255,255,255));
			 p2.add(result1);
			    
		 
		 // button panel p1
		 JPanel p1 = new JPanel();
		    p1.setBackground(new Color(173,216,230));
		    p1.setPreferredSize(new Dimension(200, 250));
	        p1.setLayout(new GridLayout(6, 3));
	        
	        p1.add(jbtNum7 = new JButton("7"));
	        p1.add(jbtNum8 = new JButton("8"));
	        p1.add(jbtNum9 = new JButton("9"));
	        
	        p1.add(jbtNum4 = new JButton("4"));
	        p1.add(jbtNum5 = new JButton("5"));
	        p1.add(jbtNum6 = new JButton("6"));
	        
	        jbtNum1 = new JButton("1");
//	        
//	        jbtNum1.setBackground(new Color(224, 255, 255));
//	        jbtNum1.setOpaque(true);
//	        jbtNum1.setBorderPainted(false);

	        p1.add(jbtNum1);
	        
	        p1.add(jbtNum2 = new JButton("2"));
	        p1.add(jbtNum3 = new JButton("3"));
	        
	        
	        
	        p1.add(jbtAdd = new JButton("+"));
	        p1.add(jbtSubtract = new JButton("-"));
	        p1.add(jbtNum0 = new JButton("0"));
	        p1.add(jbtMultiply = new JButton("*"));
	        p1.add(jbtDivide = new JButton("/"));
	        p1.add(jbtEqual = new JButton("="));
	        p1.add(jbtSqr = new JButton("√"));	 
	        p1.add(jbtDot = new JButton("."));
			p1.add(jbtClear = new JButton("CLEAR"));
			 
			 
		 
		 // add panel p1, p2 to mainpanel
	        JPanel mainpanel = new JPanel();
	        
	        mainpanel.setLayout(new BoxLayout(mainpanel,1));
	        
	        mainpanel.add(p2,BorderLayout.PAGE_START);
	        mainpanel.add(p1, BorderLayout.CENTER);
	        JFrame frame = new JFrame("Simple calculator");
	        frame.setSize(200,300);
	        
	        frame.add(mainpanel);
	       
	        
	     // set close operation to when user clicks exit
	        

	        // set the look and feel to the computer
	        try { 
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
	        } 
	        catch (Exception e) { 
	            System.err.println(e.getMessage()); 
	        } 

	        frame.pack();
	        frame.setVisible(true);
	        
	        
	        // give action to button
	        jbtNum1.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	        		 display1 = result1.getText();
	                 result.setText(display + "1");
	                 
	                 result1.setText(display1 + "1");
	        	 }
	        	 });
	        
	        
	        jbtNum2.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	                 result.setText(display + "2");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "2");
	        	 }
	        });
	        
	        jbtNum3.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		display = result.getText();
	                 result.setText(display + "3");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "3");
	        	 }
	        });
	        
	        jbtNum4.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		  display = result.getText();
	                 result.setText(display + "4");
	                 
	                 display1 = result1.getText();
	                 result1.setText(display1 + "4");
	        	 }
	        });
	        
	        jbtNum5.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		display = result.getText();
	                 result.setText(display + "5");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "5");
	        	 }
	        });
	        
	        jbtNum6.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		display = result.getText();
	                 result.setText(display + "6");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "6");
	        	 }
	        });
	        
	        jbtNum7.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	                 result.setText(display + "7");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "7");
	        	 }
	        });
	        
	        jbtNum8.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		  display = result.getText();
	                 result.setText(display + "8");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "8");
	        	 }
	        });
	        
	        jbtNum9.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	                 result.setText(display + "9");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "9");
	        	 }
	        });
	        
	        jbtNum0.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	                 result.setText(display + "0");
	                 display1 = result1.getText();
	                 result1.setText(display1 + "0");
	        	 }
	        });
	        
	        jbtDot.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 display = result.getText();
	                 result.setText(display + ".");
	                 display1 = result1.getText();
	                 result1.setText(display1 + ".");
	        	 }
	        });
	        
	        jbtSqr.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 TEMP = Double.parseDouble(result.getText());
	        		 result1.setText(result1.getText()+" √");
	        		 
	                 SqutBool = true;
	        	 }
	        });
	        
	        

		    jbtAdd.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 TEMP = Double.parseDouble(result.getText());
	        		 result1.setText(result1.getText()+"+");
	        		 result.setText("");
	        		 addBool = true;
	        		 
	        	 }
	        });
	        

	        jbtSubtract.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 TEMP = Double.parseDouble(result.getText());
	        		 result1.setText(result1.getText()+"-");
	        		 result.setText("");
	        		 subBool = true;
	        	 }
	        });
	        

	        jbtMultiply.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 TEMP = Double.parseDouble(result.getText());
	        		 result1.setText(result1.getText()+"*");
	        		 result.setText("");
	        		 mulBool = true;
	        	 }
	        });
	        

	        jbtDivide.addActionListener(new ActionListener() 
	        {
	        	 public void actionPerformed(ActionEvent e) { 
	        		 TEMP = Double.parseDouble(result.getText());
	        		 result1.setText(result1.getText()+"/");
	        		 result.setText("");
	        		 divBool = true;
	        	 }
	        });
	        
	        jbtClear.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent e) {
	        		result1.setText("");
	                result.setText("");
	                addBool = false;
	                subBool = false;
	                mulBool = false;
	                divBool = false;

	                TEMP = 0;
	                SolveTEMP = 0;
	            }
	        });
	        
	        jbtEqual.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent e) {
	        		
	                SolveTEMP = Double.parseDouble(result.getText());
	                if (addBool == true)
	                    SolveTEMP = SolveTEMP + TEMP;
	                else if ( subBool == true)
	                    SolveTEMP =  TEMP-SolveTEMP ;
	                else if ( mulBool == true)
	                    SolveTEMP = SolveTEMP * TEMP;
	                else if ( divBool == true)
	                                SolveTEMP =  TEMP/SolveTEMP;
	                else if ( SqutBool == true)
                        SolveTEMP = Math.sqrt(TEMP);
	                
	                result.setText(  Double.toString(SolveTEMP));
	                result1.setText(  Double.toString(SolveTEMP));

	                addBool = false;
	                subBool = false;
	                mulBool = false;
	                divBool = false;
	                SqutBool = false;
	            }
	        	
	        });
	        
	    }
	 
	 public static void main(String[] args) {
//		 
	        Calculator calc = new Calculator();
//	        
	    }

    }

	
// reference
//  https://stackoverflow.com/questions/4298716/simple-gui-java-calculator

