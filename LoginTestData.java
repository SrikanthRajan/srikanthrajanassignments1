package Week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername(String name)
	{
		System.out.println(" The username is"  + "" +name);
		
	}

	public void enterPassword(String password)
	{
		System.out.println(" The password is"  + "" +password);
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData tdd = new LoginTestData();
		tdd.enterUsername("SRIKANTH");
		tdd.enterPassword("Meerajasmine");
		tdd.enterCredentials();
		tdd.navigateToHomePage();
	}

}
