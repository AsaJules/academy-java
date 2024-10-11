package com.bptn.course_Week3_CodingPresentation;

class MyThread extends Thread {

	SynchronizedPrinter printer; // This will hold the printer reference

	// Constructor to initialize the printer instance
	public MyThread(SynchronizedPrinter printer) {
		this.printer = printer; // Assign the printer passed to this thread
	}

	// Override the run method to define what this thread will do
	@Override
	public void run() {
		printer.printNumbers(); // Call the printNumbers method on the printer
	}

}
