public class Book{
 
    String bookName;
	int noOfPages;
	String author;
	int price;
	int publishedYear;
	String publisher;
	String type;
	
	
	Book(String bookName,int noOfPages,String author,int price,int publishedYear,String Publisher,String type)
	{
		
		this.bookName=bookName;
		this.noOfPages=noOfPages;
		this.author=author;
		this.price=price;
		this.publishedYear=publishedYear;
		this.publisher=publisher;
		this.type=type;
		
	}
	public void printBookDetails()
	{
		System.out.println("Book:" +bookName);
		System.out.println("Pages:" +noOfPages);
		System.out.println("Author:" +author);
		System.out.println("Price:" +price);
		System.out.println("PublishedYear:" +publishedYear);
		System.out.println("Publisher:" +publisher);
		System.out.println("Type:" +type);
	}
	
public static void main(String[] args){
	
	Book book=new Book("WingsOfFire",180,"Dr.APJ Abdul Kalam",500,2000,"Arjun Tiwari","Autobiography");
	Book book1=new Book("A Fine Name",600,"Rohinton mistry",600,1995,"Stewart","Historical novel");
	Book book2=new Book("Scared Games",947,"Vikram Chandra",1500,2006,"HarperCollins","Crime");
	Book book3=new Book("The Engima Code",368,"Ethan Collins",29000,2023,"W.W.Norton and Company","Thriller");
	Book book4=new Book("Malgudi Days",264,"R.K.Narayan",300,1943,"Indian Thought Publication","Short Stories");
	Book book5=new Book("Intricate Deceptiond",384,"Daniel Reynolds",22000,2023,"Scholastic Corporation","Mystery");
	Book book6=new Book("Realm of Shadows",432,"Isabella Thompson",34000,2022,"HarperCollins","Fantasy Adventure");
	
	book.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book1.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book2.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book3.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book4.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book5.printBookDetails();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	book6.printBookDetails();
	
	
}
}