package testNG;

import org.testng.annotations.Test;

public class FacebookLogin 
{
	 @Test(groups= {"smoketesting"})
     public void WebLoginBanking() 
     {
    	 System.out.println("Facebook Web Login");
    	 
     }
	 @Test(groups= {"smoketesting"})
     public void mobileLoginBanking() 
     {
    	 System.out.println("Facebook Mobile Login");
    	 
     }
}
