package com.collection.examples;

import java.util.Arrays;
import java.util.List;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException{
//		new Service().printWeekdays();
//		System.out.println("Weeksday are completed!!...");
//		
//		Thread.sleep(10000);

//		
//		new Service().printMonths();+
//		System.out.println("Months are completed!!...");
		
	Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			new Service().printWeekdays();
			
		}
		
	});
	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			new Service().printMonths();
			
		}
		
	});
	
	//t1.run();
	t1.start();
	t2.start();

	}
}
class Service{
	void printWeekdays() {
		List<String> daylist = Arrays.asList("Sun","Mon","Tue","Wed","Fri","Sat");
		
		for(int i=0; i<100;i++) {
		System.out.println(daylist);
		}
	}
	void printMonths() {
		List<String> monthlist = Arrays.asList("Jan","Feb","Apr","May","Jun","July");
		for(int i=0; i<100;i++) {
		System.out.println(monthlist);
		}
	}
}

