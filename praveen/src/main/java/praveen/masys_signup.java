package praveen;

import java.util.ResourceBundle;

public class masys_signup {	
	
	public int userlogin(String in_user, String in_pwd)
	{
		
		 ResourceBundle rb = ResourceBundle.getBundle("valid_data");
		   
		   String username = rb.getString("username");
		   String password = rb.getString("password");
		   
	  
	   if (in_user.equals(in_user.equals("username") && in_pwd.equals("password")))
		   
		   return 1;
	   else     
	       return 0;
          

	}

	public static Object Userlogin(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
