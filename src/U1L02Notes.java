import javax.swing.JOptionPane;

public class U1L02Notes {

	public static void main(String[] args) {
	//HW for dimes and quarters is commented in all caps.
	//Pseudo code:
	/*
	//asks for the input of the cash amount
	String answer = JOptionPane.showInputDialog("Entere the monetary value (ex. 1.56): ");
//	 makes it an integer to use as a number
	double cash = Double.parseDouble(answer);
//	 divide by 5 to get number of nickels (rounding to the lower whole #)
	int nickels = (int)(cash/0.05);
//	 take change and subtract # times 5 to get the remainder, which * 100 = pennies
	int pennies = (int)((cash - .05 * nickels)) *100;
//	 print "For" + change + "in dollars equals" + nickel number + "in nickels and " + pennies
//	 + "in pennies."
	JOptionPane.showMessageDialog(null, cash + " is " + nickels + " nickels and " + pennies + " pennies.");
	 */
	 //OR
	 
	 //Define variables (nickels, etc.)
	int quarters = 0;
	int dimes = 0;
	int nickels = 0;
	int pennies = 0;
	 
	 //Get input and Change into an integer
	 String answer = JOptionPane.showInputDialog("Entere the monetary value (ex. 1.56): ");
	 double cash = Double.parseDouble(answer); 
			 // "double" variable for decimal
	 //pennies = money * 100
	 pennies = (int)(cash * 100);
	 System.out.println(pennies);
	 
	 //While money > .24 {
	 while (pennies > 24) {
		 quarter++;
			//money -= .25
			 pennies -= 25;
	 }
	 while (pennies > 9) {
		 dimes++;
			//money -= .10
			 pennies -= 10;
	 }
	 while (pennies > 4) {
		//nickels += 1
		 nickels++;
		//money -= .05
		 pennies -= 5;
	 }
	 
	 //Print answer
	 JOptionPane.showMessageDialog(null, cash + "is" + quarters + " quarters, " + dimes + " nickels, "
			 + nickels + " nickels, and " + pennies + "pennies.");
	 
	}
}