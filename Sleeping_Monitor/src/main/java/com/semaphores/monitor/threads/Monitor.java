package com.semaphores.monitor.threads;

import com.semaphores.monitor.model.MonitorOffice;

/**
 * Monitor class
 * @author Manuel Quintero
 *
 */
public class Monitor implements Runnable{
	
	/**
	 * This attribute contains a reference to the actual Office the monitor is attending.
	 */
	private MonitorOffice office;
	
	/**
	 * Constructor method for the monitor.
	 * @param of parameter that indicates the actual office the monitor is working on.
	 */
	public Monitor(MonitorOffice of) {
		office = of;
	}
	

	/**
	 * Run method.
	 */
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				if(!office.isOfficeEmpty()) {
					//Monitor finds out who is the student at the office
					Student s = office.getStudentAtOffice();
					System.out.println("The monitor is ready to attend student --> "+ s.getId());
					//Monitor attends the student
					office.attendStudent(s);
					Thread.sleep(3000);
				}
				else if(office.isWREmpty()){
					//The monitor falls asleep if the Waiting room and the office are empty.
					System.out.println("The monitor has fallen asleep!");
					Thread.sleep(3000);
				}
				
			}
			catch(Exception e) {
				
			}
		}
		
	}

}
