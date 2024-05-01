package com.selenim.variables;


/*
 * Create a class and use three types variable
	firstName
	lastName
	bankAccount
 */
public class TestOne {
   String firstName;
   static String lastName;
   public static void main(String[] args) {
		TestOne t= new TestOne();
		t.bankAccount();
		t.bankOfAmericaAccount("Rahul", "Sen");
	}
	
  public double bankAccount() {
	  double bankAccount=3000.00;
	  firstName="Faruq";
	  lastName="Molal";
	  System.out.println(firstName+" "+lastName+" "+bankAccount);
	return bankAccount;
  }
  
  
  
  public void bankOfAmericaAccount(String firstName,String lastName) {
	  double bankAccount=3000.00;
	  System.out.println(firstName+" "+lastName+" "+bankAccount);
	
  }
}
