package Week3.day1;

public class Button extends WebElement  {
	
	public void submit()
	{
		System.out.println("submit");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button bt = new Button();
		bt.submit();
		bt.click();
		bt.setText("click");
	}

}
