package linkedlist;

public class Book {

	int id;
	String bookname;
	String bookauther;
	public Book(int id, String bookname, String bookauther) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookauther = bookauther;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauther() {
		return bookauther;
	}
	public void setBookauther(String bookauther) {
		this.bookauther = bookauther;
	}
	
}
