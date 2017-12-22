package by.htp.lesson6;

public class Book {
	private String name = "Yet unknown author";
	private int year = 0;
	private int pages = 0;
	private Author author;

	public Book() {

	}

	public Book(String name, int year, int pages) {
		this.name = name;
		this.year = year;
		this.pages = pages;
		this.author = new Author();
	}
	
	public Book(String name, int year, int pages, Author author) {
		this.name = name;
		this.year = year;
		this.pages = pages;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void bookInfo() {
		System.out.print(this.name+" "+this.author.getSurName()+" "+this.author.getFirstName()+" "+this.author.getPatronymic()+" "+this.getYear());
	}
}
