package by.htp.lesson6;

public class Library {
	Book[] books;

	public Library() {
		books = new Book[0];
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void addBook(Book book) {
		Book[] temp = new Book[books.length + 1];
		for (int i = 0; i < books.length; i++) {
			temp[i] = books[i];
		}
		temp[books.length] = book;
		books = temp;
	}

	public void oldestBook() {
		Book oldest = this.books[0];
		for (Book book : this.books) {
			if (book != null) {
				if (book.getYear() < oldest.getYear()) {
					oldest = book;
				}
			}
		}
		oldest.bookInfo();
		System.out.println();
	}

	public void nameSort() {
		Book bubble = books[0];
		int flag = 1;
		if (books != null) {
			while (flag != 0) {
				flag = 0;
				for (int i = 1; i < books.length; i++) {
					if (books[i] != null && books[i - 1] != null
							&& books[i - 1].getName().compareToIgnoreCase(books[i].getName()) > 0) {
						flag++;
						bubble = books[i];
						books[i] = books[i - 1];
						books[i - 1] = bubble;
					}
				}
			}
		}
	}

	public void yearSort() {
		Book bubble = books[0];
		int flag = 1;
		if (books != null) {
			while (flag != 0) {
				flag = 0;
				for (int i = 1; i < books.length; i++) {
					if (books[i] != null && books[i - 1].getYear() > books[i].getYear()) {
						flag++;
						bubble = books[i];
						books[i] = books[i - 1];
						books[i - 1] = bubble;
					}
				}
			}
		}
	}

	public void getBooksInRange(int from, int to) {
		if (books != null) {
			for (Book book : books) {
				if (books != null && book.getYear() >= from && book.getYear() <= to) {
					book.bookInfo();
					System.out.println();
				}
			}
		}
	}

	public void searchByAuthor(String surName) {
		if (books != null) {
			int count = 0;
			for (Book book : books) {
				if (book != null && book.getAuthor().getSurName().compareToIgnoreCase(surName) == 0) {
					book.bookInfo();
					System.out.println();
					count++;
				}
			}
			if (count == 0) {
				System.out.println("No Match Found");
			}
		}
	}

	public void searchByAuthor(String surName, String firstName) {
		if (books != null) {
			int count = 0;
			for (Book book : books) {
				if (book != null && book.getAuthor().getSurName().compareToIgnoreCase(surName) == 0
						&& book.getAuthor().getFirstName().compareToIgnoreCase(firstName) == 0) {
					book.bookInfo();
					System.out.println();
					count++;
				}
			}
			if (count == 0) {
				System.out.println("No Match Found");
			}
		}
	}

	public void searchByName(String name) {
		if (books != null) {
			int count = 0;
			for (Book book : books) {
				if (book != null && book.getName().compareToIgnoreCase(name) == 0) {
					book.bookInfo();
					System.out.println();
					count++;
				}
			}
			if (count == 0) {
				System.out.println("No Match Found");
			}
		}
	}

	public void searchByNameAndAuthor(String name, String authorSurName) {
		if (books != null) {
			int count = 0;
			for (Book book : books) {
				if (book != null && book.getName().compareToIgnoreCase(name) == 0
						&& book.getAuthor().getSurName().compareToIgnoreCase(authorSurName) == 0) {
					book.bookInfo();
					System.out.println();
					count++;
				}
			}
			if (count == 0) {
				System.out.println("No Match Found");
			}
		}
	}

	public void removeBook(String name, String authorSurName, String authorFirstName) {
		int count = 0;
		if (books != null) {
			for (int i = 0; i < books.length; i++) {
				if (books[i] != null && books[i].getName().compareToIgnoreCase(name) == 0
						&& books[i].getAuthor().getSurName().compareToIgnoreCase(authorSurName) == 0
						&& books[i].getAuthor().getFirstName().compareToIgnoreCase(authorFirstName) == 0) {
					count++;
				}
			}
		}
		while (count != 0) {
			Book[] temp = new Book[books.length - count];
			if (books != null) {
				int index = 0;
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null && books[i].getName().compareToIgnoreCase(name) == 0
							&& books[i].getAuthor().getSurName().compareToIgnoreCase(authorSurName) == 0
							&& books[i].getAuthor().getFirstName().compareToIgnoreCase(authorFirstName) == 0) {
						index = i;
					}
				}
				for (int i1 = 0; i1 < index; i1++) {
					if (books[i1] != null) {
						temp[i1] = books[i1];
					}
				}
				for (int i1 = index; i1 < temp.length; i1++) {
					if (books[i1] != null) {
						temp[i1] = books[i1+1];
					}
				}
				books = temp;
				count--;
			}
		}
	}

	public void numberOfBooks() {
		int count = 0;
		if (books != null) {
			Book[] book1 = this.books.clone();
			for (Book book : book1) {
				if (book != null) {
					count = 0;
					Book temp = book;
					for (int i=0;i<book1.length;i++) {
						if (book1[i] != null && book1[i].getName().compareToIgnoreCase(book.getName()) == 0
								&& book1[i].getAuthor().getSurName()
										.compareToIgnoreCase(book.getAuthor().getSurName()) == 0
								&& book1[i].getAuthor().getFirstName()
										.compareToIgnoreCase(book.getAuthor().getFirstName()) == 0) {
							count++;
							book1[i] = null;
						}
					}
					temp.bookInfo();
					System.out.println(" number of books - " + count);
				}
			}
		}
	}

	public void authorNameBookNameSort() {
		Book bubble = books[0];
		int flag = 1;
		if (books != null) {
			while (flag != 0) {
				flag = 0;
				for (int i = 1; i < books.length; i++) {
					if (books[i - 1] != null && books[i] != null) {
						String strToSort1 = books[i - 1].getAuthor().getSurName()
								+ books[i - 1].getAuthor().getFirstName() + books[i - 1].getAuthor().getPatronymic()
								+ books[i - 1].getName();
						String strToSort2 = books[i].getAuthor().getSurName() + books[i].getAuthor().getFirstName()
								+ books[i].getAuthor().getPatronymic() + books[i].getName();
						if (strToSort1.compareToIgnoreCase(strToSort2) > 0) {
							flag++;
							bubble = books[i];
							books[i] = books[i - 1];
							books[i - 1] = bubble;
						}
					}
				}
			}
		}
	}

	public void authorBooksInRange(String surName, String firstName, int from, int to) {
		if (books != null) {
			int count = 0;
			for (Book book : books) {
				if (book != null && surName.compareToIgnoreCase(book.getAuthor().getSurName()) == 0
						&& firstName.compareToIgnoreCase(book.getAuthor().getFirstName()) == 0 && book.getYear() >= from
						&& book.getYear() <= to) {
					count++;
				}
			}
			if (count>0) {
				Book[] tempBooks = new Book[count];
				int i = 0;
				for (Book book : books) {
					if (book != null && surName.compareToIgnoreCase(book.getAuthor().getSurName()) == 0
							&& firstName.compareToIgnoreCase(book.getAuthor().getFirstName()) == 0
							&& book.getYear() >= from && book.getYear() <= to) {
						tempBooks[i] = book;
						i++;
					}
				}
				Book bubble = tempBooks[0];
				int flag = 1;
				if (tempBooks != null) {
					while (flag != 0) {
						flag = 0;
						for (int j = 1; j < tempBooks.length; j++) {
							if (tempBooks[j] != null && tempBooks[j - 1].getYear() > tempBooks[j].getYear()) {
								flag++;
								bubble = tempBooks[j];
								tempBooks[j] = tempBooks[j - 1];
								tempBooks[j - 1] = bubble;
							}
						}
					}
					for (Book book : tempBooks) {
						book.bookInfo();
						System.out.println();
					}
				} 
			}
		}
	}

	public void booksInfo() {
		for (Book book : books) {
			book.bookInfo();
			System.out.println();
		}
	}
}
