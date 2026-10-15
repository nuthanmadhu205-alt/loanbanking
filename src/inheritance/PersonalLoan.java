package inheritance;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl{
	void getPersonalLoanDocInfo() {
		System.out.println("All the Personal loan  documents verified Successfully !! ");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("welcome to Personal Loan Banking!!");
		
		PersonalLoan  pl = new PersonalLoan();
		double salary = pl.getCustomerSalary();
		int age = pl.getcustomerAge();
		int cibil = pl.getCibilScore();
		
		if(salary >=900000.00 && age >= 26 && cibil >= 300 && cibil<=900)
		{
			System.out.println("Basic information is validated check personal details");
			if(pl.isPhoneValid() && pl.isAadharValid()&& pl.isPanValid())
			{
				System.out.println("Details are good and  Loan got approved !!");
				System.out.println("your Loan ROI is : "+ pl.getLoanROT());
				pl.getPersonalLoanDocInfo();
			}else {
				System.out.println("something went wrong !");
			}
		}else {
			
			System.out.println("You are not eligible for Personal Loan and you loan got rejected");
		}
		
		System.out.println("main method ended");
		
		

	}
	
}


