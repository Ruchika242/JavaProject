package Assignments;

public class UserLogin {
   String expectedUserID = "pivotAdmin";
   String expectedPwd = "Admin123";
   String enteredUsername;
   String enteredPwd;
   int invalidAttempts=3;
   
   void userLoginFunctionality() {
	   if(enteredUsername.equalsIgnoreCase(expectedUserID) && enteredPwd.equals(expectedPwd)) {
		   System.out.println("Login Successful");
		   return;
		 }
	   
	   
	   else {
		   System.out.println("Invalid credentials, please try again");
		   invalidAttempts--;
	 
		   
			   
		   
	   }
		  
   }
}
