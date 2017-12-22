package by.htp.lesson6;

public class MainApp {

	public static void main(String[] args) {
		Author a1 = new Author("Bibkov","Alex","Benediktovich", 1920);
		Author a2 = new Author("Veremeniuk","Valentin","Valentinovich", 1965);
		Author a3 = new Author("Moby","Dick","Whalovich", 1832);
		Author a4 = new Author("Odinson","Thor","Odinovich", 920);
		Author a5 = new Author();
		
		Library library = new Library();
		Book b1 = new Book("Jungles", 1958, 400, a1);
		library.addBook(b1);
		Book b2 = new Book("Mathematicks", 1970, 558, a2);
		library.addBook(b2);
		Book b3 = new Book("Phisicks", 1902, 320, a3);
		library.addBook(b3);
		Book b4 = new Book("Oranges and frogs", 1020, 400, a4);
		library.addBook(b4);
		Book b5 = new Book("Songs of my youth", 1948, 50, a5);
		library.addBook(b5);
		Book b6 = new Book("Jungles 2: Maugly origins", 1988, 420, a1);
		library.addBook(b6);
		Book b7 = new Book("Fun math and how to use it", 1998, 120, a2);
		library.addBook(b7);
		Book b8 = new Book("Phisicks is boring, how to construct toy robots!", 1935, 200, a3);
		library.addBook(b8);
		Book b9 = new Book("Harry Potter and the WTF Books names!", 1750, 700, a4);
		library.addBook(b9);
		Book b10 = new Book("Songs of my last days", 2010, 500, a5);
		library.addBook(b10);
		
		library.oldestBook();
		System.out.println();
		library.yearSort();
		library.booksInfo();
		System.out.println();
		library.getBooksInRange(1720, 1970);
		System.out.println();
		library.searchByAuthor("Odinson");
		System.out.println();
		library.searchByAuthor("Veremeniuk", "Valentin");
		System.out.println();
		library.searchByName("Songs of my last days");
		System.out.println();
		library.searchByNameAndAuthor("Songs of my last days", "Pupkin");
		System.out.println();
		library.searchByName("Philosophy of Java");
		System.out.println();
		library.booksInfo();
		System.out.println();
		library.removeBook("Phisicks is boring, how to construct toy robots!", "Moby", "Dick");
		library.booksInfo();
		System.out.println();
		library.numberOfBooks();
		System.out.println();
		library.addBook(b1);
		library.numberOfBooks();
		library.authorBooksInRange("Odinson", "Thor", 1000, 1650);
		System.out.println();
		
		
	}

}
