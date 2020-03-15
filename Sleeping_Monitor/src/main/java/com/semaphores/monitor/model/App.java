package com.semaphores.monitor.model;

import com.semaphores.monitor.threads.Monitor;
import com.semaphores.monitor.threads.Student;

/**
 * 
 * @author Manuel Quintero
 *
 */
public class App 
{
	
	/**
	 * Main method to load Sleeping monitor project
	 * @param args
	 */
    public static void main( String[] args )
    {
    	
    	// First initialize the Monitor's Office
    	
        MonitorOffice mOffice = new MonitorOffice();
        
        // Random number that will define how many students will be part of the sleeping
        // monitor problem. 
        int numStudents = (int) (Math.random()*20)+1;

        
         System.out.println("Number of students = "+ numStudents);
         
         
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         // Initialize every student thread.
        for (int i = 0; i < numStudents; i++) {
			Student s = new Student(mOffice);
			Thread threadS = new Thread(s);
			threadS.start();		
		}
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //Initialize the monitor thread.
        
        Monitor m = new Monitor(mOffice);
        Thread threadM = new Thread(m);
        threadM.start();
        
    }
}
