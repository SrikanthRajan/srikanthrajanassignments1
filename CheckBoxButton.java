package Week3.day1;

public class CheckBoxButton extends Button{
	
	
		public void clickCheckButton()
		{
			System.out.println("Check box button is clicked");
			
		}
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton cbbb = new CheckBoxButton();
		cbbb.clickCheckButton();
		cbbb.click();
		cbbb.setText("submittedd");
	}

}
