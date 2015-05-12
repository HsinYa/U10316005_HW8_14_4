import java.util.Scanner;

public class TestLoan {
	public static void main(String args[]){
		//Create a object 
		Loan loan = new Loan();
		Scanner input = new Scanner(System.in);
		//Let user enters the values
		System.out.print("Please enter the Annual Interest Rate: ");
		double rate = input.nextDouble();
		System.out.print("Please enter the Number Of Years: ");
		int year = input.nextInt();
		System.out.print("Please enter the Loan Amount: ");
		double amount = input.nextDouble();

		try{
			new Loan(rate,year,amount);
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}catch(Exception e){
			System.out.println("Exception in main.");
		}
		
		try{
			loan.setAnnualInterestRate(rate);
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}catch(Exception e){
			System.out.println("Exception in main.");
		}

    try{
			loan.setNumberOfYears(year);
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}catch(Exception e){
			System.out.println("Exception in main.");
		}
		
		try{
			loan.setLoanAmount(amount);
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}catch(Exception e){
			System.out.println("Exception in main.");
		}

		System.out.println("End of program.");
	}
}
