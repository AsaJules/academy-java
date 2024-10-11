package com.bptn.course_Week3_CodingPresentation;

//Main class where the program execution starts
public class Main {

	public static void main(String[] args) {
		SynchronizedPrinter printer = new SynchronizedPrinter(); // Create a printer object

		// Create two threads using the same printer
		MyThread t1 = new MyThread(printer); // First thread
		MyThread t2 = new MyThread(printer); // Second thread

		// Start the threads
		System.out.println("Starting thread 1");
		t1.start(); // Start the first thread
		System.out.println("Starting thread 2");
		t2.start(); // Start the second thread

		// Wait for both threads to finish
		try {
			t1.join(); // Wait for thread 1 to finish
			t2.join(); // Wait for thread 2 to finish
		} catch (InterruptedException e) {
			e.printStackTrace(); // Print any interruption errors
		}

		// Final message indicating that both threads have finished
		System.out.println("Both threads have finished execution.");
	}

}
