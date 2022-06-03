package calculator125;

/**
 * @author Coder
 * 
 * This is the View component of the application.
 * The View component responsibility is to display what 
 * the user will see while interacting with the application. 
 * This component performs no calculations, rather it must 
 * pass information entered by the user to the Controller 
 * component, which will use it.
 **/

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {

	private final JTextField firstNumber  = new JTextField(10);
	private final JLabel plusSignLabel    = new JLabel("+");
	private final JTextField secondNumber = new JTextField(10);
	private final JButton calculateButton = new JButton("Calculate");
	private final JTextField calcSolution = new JTextField(10);
        
        private final JTextField firstMultNumber  = new JTextField(10);
	private final JLabel multSignLabel    = new JLabel("*");
	private final JTextField secondMultNumber = new JTextField(10);
	private final JButton calculateMultButton = new JButton("Calculate");
	private final JTextField multSolution = new JTextField(10);
	
	CalculatorView() {
            setLayout(new GridLayout(2,1));
		
	// Sets up the view and adds the visual Java Swing components.
		
            JPanel calcPanel = new JPanel();
            JPanel calcPanel1 = new JPanel();
	
        // Set the JFrame's title.    
            this.setTitle("Calculation 125");
            
        // Set the JFrame's close button to exit the application.    
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        // Set the JFrame width to 600 pixels by 200 pixels high.    
            this.setSize(600, 200);
            
        // Align this JFrame centered on the window.    
            this.setLocationRelativeTo(null);
            
        // Make the text fields aligned to the right edge of the box.
        
            firstNumber.setHorizontalAlignment(SwingConstants.RIGHT);
            secondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
            calcSolution.setHorizontalAlignment(SwingConstants.RIGHT);
         
            firstMultNumber.setHorizontalAlignment(SwingConstants.RIGHT);
            secondMultNumber.setHorizontalAlignment(SwingConstants.RIGHT);
            multSolution.setHorizontalAlignment(SwingConstants.RIGHT);
            
        // Add the JTextField components, the JLabel component, and the
        //  JButton component to the JPanel named calcPanel.
        
            calcPanel.add(firstNumber);
            calcPanel.add(plusSignLabel);
            calcPanel.add(secondNumber);
            calcPanel.add(calculateButton);
            calcPanel.add(calcSolution);
            
            calcPanel1.add(firstMultNumber);
            calcPanel1.add(multSignLabel);
            calcPanel1.add(secondMultNumber);
            calcPanel1.add(calculateMultButton);
            calcPanel1.add(multSolution);
            
	
        // Then add the JPanel to the JFrame.
            this.add(calcPanel);
            this.add(calcPanel1);
	}
	
        // The Controller component will use this method to determine
        // the information entered in the first integer text box. If
        // that information cannot be converted into a valid integer
        // (because it is empty or has non-numeric values), then the
        // Controller component will catch that error and display it
        // to the user.
        
	public int getFirstNumber() {
		
		return Integer.parseInt(firstNumber.getText());		
	}
	
	public int getSecondNumber() {
		
		return Integer.parseInt(secondNumber.getText());		
	}
	
	public int getCalcSolution() {
		
		return Integer.parseInt(calcSolution.getText());		
	}
	
	public void setCalcSolution(int solution) {
		
		calcSolution.setText(Integer.toString(solution));		
	}
        
        public int getFirstMultNumber() {
		
		return Integer.parseInt(firstMultNumber.getText());		
	}
	
	public int getSecondMultNumber() {
		
		return Integer.parseInt(secondMultNumber.getText());		
	}
	
	public int getMultSolution() {
		
		return Integer.parseInt(multSolution.getText());		
	}
	
	public void setMultSolution(int solution) {
		
		multSolution.setText(Integer.toString(solution));		
	}
	
	// If the calculateButton is clicked, execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton) {
		
		calculateButton.addActionListener(listenForCalcButton);		
	}
        void multCalculateListener(ActionListener listenForCalcButton) {
		
		calculateMultButton.addActionListener(listenForCalcButton);		
	}
	
	// Open a popup panel that contains the error message passed to it.
	
	void displayErrorMessage(String errorMessage) {
		
		JOptionPane.showMessageDialog(this, errorMessage);		
	}	
}  //end CalculatorView