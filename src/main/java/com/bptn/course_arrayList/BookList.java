package com.bptn.course_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// create a new ArrayList called "myBooks"
		ArrayList<String> myBooks = new ArrayList<String>();

		// add 3 favorite books to this list
		myBooks.add("Wuxia World");
		myBooks.add("Harry Potter");
		myBooks.add("The Great Gatsby");

		// Display all books
		System.out.println("My favorite books are: " + myBooks);

		// Display the first book from the list
		System.out.println(myBooks.get(0));
		System.out.println(myBooks.getFirst());

		// Delete the second book
		myBooks.remove(1);
		System.out.println("My favorite books are:" + myBooks);

		// Search for a book
		if (myBooks.contains("harry potter".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}

		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The last item of the list is: " + myBooks.get(myBooks.size() - 1));

	}

}
