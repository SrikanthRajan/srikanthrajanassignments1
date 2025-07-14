package Week2.day1;

public class Library {
	
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	
	
	public String issueBook()
	{
		System.out.println("Book issued successfully");
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj1 = new Library();
		String obj2 =obj1.addBook("Alchemist");
		System.out.println(obj2);
		obj1.issueBook();
		
	}

}
