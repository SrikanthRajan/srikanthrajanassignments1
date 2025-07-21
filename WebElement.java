package Week3.day1;

public class WebElement {
	
	
	public void click()
	
	{
		System.out.println(" Click the element :");
		
	}
	
	
	public void setText(String Text)
	{
		System.out.println(" The text is :" + Text);
	}
	
	

	public static void main(String[] args) {
		WebElement web1 = new WebElement();
	web1.click();
	web1.setText("Entertainment");
		
		// TODO Auto-generated method stub

		
		
		
	}

}
