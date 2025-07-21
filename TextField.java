package Week3.day1;

public class TextField extends WebElement{

	
public void getText()
{
	System.out.println("Print the text");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tff = new TextField();
		tff.getText();
		tff.click();
		tff.setText("text");
	}

}
