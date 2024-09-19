package joseph_sprott_assignment02;


import javax.swing.JOptionPane;

public class joseph_sprott_assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		
		firstName = JOptionPane.showInputDialog("Enter your first name");
		middleInitial = JOptionPane.showInputDialog("Enter your middle name").charAt(0);
		lastName = JOptionPane.showInputDialog("Enter your last name");
	    age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("enter your gross annual pay"));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("enter your tax rate"));
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay*taxRate);
		
		System.out.println("Hello " + firstName +" " + middleInitial +" "+ lastName + ", \nyou are " + age + " years old now.\n" + "It is amazing that you made " 
				+"$"+ grossAnnualPay + " this year. With the tax\nrate of " + taxRate +", you can take home " + grossAnnualPay + ".");
		
	}

}
