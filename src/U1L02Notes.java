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
	 
		/*
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
		 quarters++;
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
	 */
		
		//P
				//MD% (same level done left to right)
				//AS (same level done left to right)
				//Answer: 14
				//Answer: 13
				//13 / 4 = 3 r. 1
				//13%4 = 1
				//Modulus (%) is the remainder of division
				//Notes are on the com sci II doc
				
				int quarters = 0;
				int dimes = 0;
				int nickels = 0;
				int pennies = 0;
				 
				 String answer = JOptionPane.showInputDialog("Entere the monetary value (in whole cents): ");
				 double cash = Double.parseDouble(answer); 
						 // "double" variable for decimal
				 //pennies = money * 100
				 pennies = (int)(cash *100);
				 System.out.println(pennies);
				 //For some reason it does not change 1.16 into 116, but instead 115. But is seems okay with other numbers.
				 
				 
				 //While money > .24 {
				 if (pennies > 0) {
					 quarters = pennies/25;
					 pennies = pennies % 25;
					 
					 dimes = pennies/10;
					 pennies = pennies % 10;
					 
					 nickels = pennies / 5;
					 pennies = pennies % 5;
					 
				 }
				 
				int quartersTwo = 0;
				int dimesTwo = 0;
				int nickelsTwo = 0;
				int penniesTwo = 0;
					
				 String answerTwo = JOptionPane.showInputDialog("Entere the value (in whole cents): ");
				 double cashTwo = Double.parseDouble(answerTwo); 
						 // "double" variable for decimal
				 //pennies = money * 100
				 penniesTwo = (int)(cashTwo * 100);
				 System.out.println(penniesTwo);
				 //For some reason it does not change 1.16 into 116, but instead 115. But is seems okay with other numbers.
				 
				 
				 //While money > .24 {
				 if (penniesTwo > 0) {
					 quartersTwo = penniesTwo/25;
					 penniesTwo = penniesTwo % 25;
					 
					 dimesTwo = penniesTwo/10;
					 penniesTwo = penniesTwo % 10;
					 
					 nickelsTwo = penniesTwo / 5;
					 penniesTwo = penniesTwo % 5;
					 
				 }
				 JOptionPane.showMessageDialog(null, "Your first amount " + cash + " is " + quarters + " quarters, " + dimes 
						 + " dimes, " + nickels + " nickels, and " + pennies + " pennies. \n" 
						 + "Your second amount: " + cashTwo + " is " + quartersTwo + " quarters, " + dimesTwo 
						 + " dimes, " + nickelsTwo + " nickels, and " + penniesTwo 
						 + " pennies. \n Average amount of the two amounts are: " + ((cashTwo + cash)/2) + ".");
				 //Print answer
				 

	}
}