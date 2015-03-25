import javax.swing.JOptionPane;
public class Seasons {
	enum MonthType {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MonthType [] choices = {MonthType.January, MonthType.February, MonthType.March, MonthType.April, MonthType.May, MonthType.June, MonthType.July, MonthType.August, MonthType.September, MonthType.October, MonthType.November, MonthType.December};
boolean continueLoop = true;
//Loops and continues to prompt for month. Allows user to explore all options and then exit loop with cancel.
while (JOptionPane.showConfirmDialog(null, "Select month" , "Select Month" , JOptionPane.CANCEL_OPTION)==0) {
MonthType Decision =	(MonthType) JOptionPane.showInputDialog(null, "Select your month.", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[4]);

	switch (Decision) {
	case January: case February: case December:
		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");}
	
	switch (Decision) {
	case March: case April: case May:
		JOptionPane.showMessageDialog(null, "Happy spring days!");
		}
	
	switch (Decision) {
	case September: case October: case November:
		JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");}
	
	switch (Decision) {
	case June: case July: case August:
		JOptionPane.showMessageDialog(null, "It's summer time!");}
	

	}
	
	
	
	}}
	

	