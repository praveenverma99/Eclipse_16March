package praveen;

import java.security.PublicKey;

import javax.security.auth.login.AppConfigurationEntry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test_singup {

	
	@Test
	public void testlogin1()
	{
		masys_signup myapp = new masys_signup ();
		
		Assert.assertEquals(0, masys_signup.Userlogin("praveenmasys@gmail.com, masys#A546"));
	  
	  
		
		
	}

}
