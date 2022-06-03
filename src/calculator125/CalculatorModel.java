package calculator125;

/**
 * @author Coder
 * 
 * This is the Model component of the application.
 * The Model component responsibility is to perform all
 * the necessary calculations as required. This component
 * does not need to use the View component at all.
 **/




public class CalculatorModel {
    private int multi;

    // Maintains the value of the sum of the numbers entered in the view.
	
    private int calculationValue;
	
    public void addTwoNumbers(int firstNumber, int secondNumber) {
		
	calculationValue = firstNumber + secondNumber;
    }
	
    public int getCalculationValue() {
		
	return calculationValue;		
    }
    
    
    
    public void multTwoNumbers(int firstNumber, int secondNumber) {
		
	multi = firstNumber * secondNumber;
    }
	
    public int getMulti() {
	return multi;		
    }
} // end CalculatorModel