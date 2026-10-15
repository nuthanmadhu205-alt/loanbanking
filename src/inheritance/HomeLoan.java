package inheritance;

public class HomeLoan extends LoanImpl{
	
	@Override
	 public double getLoanROT(){
		  
		  
		  double roi = 6.5;
		  
		   int cibil = getCibilScore();
		   if (cibil >=300 && cibil <= 549) {

			   System.out.println("Poor High risk; loan applications are likely to be rejected or approved at high interest rates");

			   roi = roi + 4.0;
		  }else if (cibil >= 550 && cibil <=699){

		   System.out.println("Fair Moderate risk; may face limitations in credit approval ");
		   roi = roi + 2.0;
		    } else if (cibil>= 700 && cibil <=749)   {

		   System.out.println(" Good Low risk; better chances of loan approval with favorable terms");
           roi = roi +1.5;
           } else if (cibil>= 750 && cibil<= 900) {

		  System.out.println( "Excellent Very low risk; highest likelihood of approval and access to lower interest rates");
          roi = roi + 0.5;


		   }
		   else
		   {

		   System.err.println("Invalid Cibil information!! Can you connect with Relationship Manager of your Bank ");
		   roi = roi + 10.0;

		   }
		   
		    return roi;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		System.out.println("welcome to RAX Home Loan Banking!!");
		
		HomeLoan  hl = new HomeLoan();
		double salary = hl.getCustomerSalary();
		int age = hl.getcustomerAge();
		int cibil = hl.getCibilScore();
		
		if(salary >=800000.00 && age >= 25 && cibil >= 300 && cibil<=900)
		{
			System.out.println("Basic information is validated check personal details");
			if(hl.isPhoneValid() && hl.isAadharValid()&& hl.isPanValid())
			{
				System.out.println("Details are good and Loan got approved !!");
				System.out.println("your Loan ROI is : "+ hl.getLoanROT());
				hl.getHomeLoanDocInfo();
			}else {
				System.out.println("something went wrong !");
			}
		}else {
			
			System.out.println("You are not eligible for Home Loan and you loan got rejected");
		}
		
			}
	
	
	private void getHomeLoanDocInfo() {
		System.out.println("All the Home Loan documents Verified Successfully !!");
	}

}
