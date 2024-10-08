package com.thread;

import java.util.concurrent.Callable;

public class LabmdaDemo {

	public static void main(String[] args) {
		Ishan ishan = new Ishan();
		Thread t1 = new Thread(ishan);
		t1.start();
		
		//Alternative
		Runnable r1 = () -> System.out.println();
	
	}
}

class Ishan implements Runnable {

	@Override
	public void run() {
		System.out.println("Running inside ishan");
	}
}

class Dhruv implements Callable {

	@Override
	public Object call() throws Exception {
		return null;
	}
}
