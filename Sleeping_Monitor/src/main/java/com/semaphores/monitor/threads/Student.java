package com.semaphores.monitor.threads;

import java.util.UUID;

import com.semaphores.monitor.model.MonitorOffice;

public class Student implements Runnable {
	
	
	/**
	 * Constant String that defines the state of the student is: Waiting room
	 */
	public static final String STATE_WAITING = "Waiting room";
	/**
	 * Constant String that defines the state of the student is: Office
	 */
	public static final String STATE_OFFICE = "Office";
	/**
	 * Constant String that defines the state of the student is: Computers
	 */
	public static final String STATE_COMPUTERS = "Computers";
	/**
	 * Constant String that defines the state of the student is: Attended
	 */
	public static final String STATE_ATTENDED = "Attended";
	
	
	/**
	 * Attribute that contains the id of the Student
	 */
	private String id;
	/**
	 * Attribute that contains the state of the Student
	 */
	private String state;
	/**
	 * Attribute that refers to the Monitor's Office that the student will go to
	 */
	private MonitorOffice office;
	
	
	/**
	 * Constructor method for the Student
	 * @param of parameter that indicates the actual office the student will go to
	 */
	public Student(MonitorOffice of) {
		id = UUID.randomUUID().toString().substring(0, 3);
		state = STATE_COMPUTERS;
		office = of;
	}
	

	/**
	 * Run method.
	 */
	public void run() {

		//While the state is not attended then the Student will keep trying to go
		//to the Monitor's Office
		while (true && !state.equals(STATE_ATTENDED)) {
			try {
			Thread.sleep(4000);
			double intent = Math.random();
			//If the Student is currently in the range of the intent and the
			// Students is in the computers room then the Student can try to
			// go to the Monitor's Office.
			if(intent < 0.3 && state.equals(STATE_COMPUTERS)) {
				System.out.println("The student " + this.id + " will look for the monitor");
				office.addStudentToOffice(this);
			}
			
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Method that prints out in the Console the actual state of the Student.
	 */
	public void printState() {
		System.out.println("The student " + this.getId() + "is located in " + this.getState());
	}
	

}
