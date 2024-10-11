package com.bptn.course_Week3_CodingPresentation;

public class SynchronizedPrinter {

	// Method that prints numbers from 1 to 5
	void printNumbers() {
		synchronized (this) { // Start of synchronized block
			System.out.println("Inside of the synchronized block.");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i); // Print the current number
				try {
					Thread.sleep(500); // Pause for 500 milliseconds
				} catch (InterruptedException ex) {
					System.out.println(ex.getMessage()); // Print any interruptions
				}
			}
		} // End of synchronized block
	}

}
