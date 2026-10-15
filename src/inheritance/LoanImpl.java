package inheritance;

import java.util.Scanner;

public class LoanImpl implements loan {

	static Scanner sc = new  Scanner(System.in);
	@Override
 	public boolean isPhoneValid() {
		System.out.println("Enter your mobile number ");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar");
		String aadhar = sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}
	@Override
	public boolean isPanValid(){
		System.out.println("Enter PAN card details : ");
		String pan = sc.next();
		return pan.matches("[A-z]{5}[0-9]{4}[A-z]{1}");
		
	}
	@Override
	  public double getLoanROT(){
		  
		  
		  double roi = 8.5;
		  
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
	@Override
	public int getCibilScore() {
		System.out.println("Enter your Cibil score: ");
		int cibil=sc.nextInt();
		return cibil;
	}
	
	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		return salary;
	    }
	@Override
     public int getcustomerAge(){
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		return age;
		}
	
	

}
