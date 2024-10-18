package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library with a title, author, ISBN number, and publication year.
 */
public class Book {
    private String title;          // The title of the book
    private String author;         // The author of the book
    private String ISBN;           // The ISBN number (unique identifier) of the book
    private int yearPublished;     // The year the book was published
    
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.setTitle(title);
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }
    
    /**
     * Gets the title of the book.
     *
     * @return The title of the book
     */
	public String getTitle() {
		return title;
	}
	
	 /**
     * Sets the title of the book.
     *
     * @param title The new title of the book
     */
	public void setTitle(String title) {
		this.title = title;
	}
	
    /**
     * Gets the author of the book.
     *
     * @return The author of the book
     */
	public String getAuthor() {
		return title;
	}

	/**
     * Sets the author of the book.
     *
     * @param author The new author of the book
     */
	public void setAuthor(String author) {
		this.author = author;
	}
    
	/**
     * Gets the ISBN of the book.
     *
     * @return The ISBN number of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The new ISBN number of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return The year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year the book was published
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Checks if two Book objects are equal based on their ISBN and author.
     *
     * @param book The object to compare with
     * @return true if the ISBN and author are the same; false otherwise
     */
    @Override
    public boolean equals(Object book) {
        if (this == book) {
            return true;
        }
        if (book == null || getClass() != book.getClass()) {
            return false;
        }
        Book otherBook = (Book) book;
        return ISBN.equals(otherBook.ISBN) && author.equals(otherBook.author);
    }
    
    /**
     * Returns a string representation of the Book object.
     *
     * @return A string in the format: Title: {title}, Author: {author}, ISBN: {ISBN}, Year Published: {yearPublished}
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}