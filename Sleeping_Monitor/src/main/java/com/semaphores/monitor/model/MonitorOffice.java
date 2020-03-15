package com.semaphores.monitor.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

import com.semaphores.monitor.threads.Student;

/**
 * Monitor's Office class
 * @author Manuel Quintero
 *
 */

public class MonitorOffice {
	
	/**
	 * Constant that defines how many seats are available in the waiting room.
	 */
	public static final int NUMBER_OF_SEATS_WR = 3;
	
	
	/**
	 * Queue that express the office of the monitor, it can only have 1 student in it. 
	 * (Size = 0 if there is no student,  Size = 1 if there is a student)
	 */
	private Queue<Student> office;
	/**
	 * Queue that express the waiting room to access the monitor's office, only
	 * 3 students can wait in this room for the monitor.
	 */
	private Queue<Student> waitingRoom;
	
	
	/**
	 * Attribute that corresponds to the semaphore to allow access to the office.
	 */
	private Semaphore semOffice;
	/**
	 * Attribute that corresponds to the semaphore to allow access to the waiting room.
	 */
	private Semaphore semWR;
	/**
	 * Attribute that corresponds to the semaphore to attend the student.
	 */
	private Semaphore semAttend;
	
	/**
	 * Constructor method.
	 */
	
	public MonitorOffice() {
		office = new LinkedList <Student>();
		waitingRoom = new LinkedList<Student>();
		semOffice = new Semaphore(1);
		semAttend = new Semaphore(1);
		semWR = new Semaphore(NUMBER_OF_SEATS_WR);
			
	}
	
	/**
	 * Method that attends a Student, a student is attended by changing it's
	 * state to ATTENDED.
	 * @param s Parameter that refers to the student that will be attended.
	 */
	public void attendStudent(Student s) {
		try {
			semAttend.acquire();
			if(!isOfficeEmpty()) {
				s.setState(Student.STATE_ATTENDED);
				System.out.println("The student " + s.getId() + " was attended by the monitor");
				office.poll();
				Thread.sleep(3000);
				if(!isWREmpty()) {
					addStudentToOfficeFromWR();
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			semAttend.release();
		}
		
	}
	
	/**
	 * Method that returns a boolean if the offices has or not students.
	 * @return a boolean that returns true if the office has no students in it.
	 */
	public boolean isOfficeEmpty() {
				
		return office.size()==0;
		
	}
	
	/**
	 * Method that returns a boolean if the waiting room has available spaces
	 * for the students to sit.
	 * @return a boolean that returns true if the waiting room has seats available.
	 */
	public boolean isWRAvailable() {
		return waitingRoom.size() < NUMBER_OF_SEATS_WR;			
	}
	/**
	 * Method that returns a boolean if the waiting room has or not students.
	 * @return a boolean that returns true if the waiting room has no students in it.
	 */
	
	public boolean isWREmpty() {
		return waitingRoom.size() == 0;			
	}
	
	/**
	 * Method that adds a Student to either the office, the waiting room if
	 * the conditions are met. If not, then it's returns the Student to the
	 * Computers room.
	 * @param s Parameters that refers to the Student that will try to be attended by the monitor.
	 */
	public void addStudentToOffice(Student s) {
		try {
			semOffice.acquire();
			semWR.acquire();
			if(isOfficeEmpty()) {
				s.setState(Student.STATE_OFFICE);
				office.add(s);
				
				
			}
			else if(isWRAvailable()) {	
				s.setState(Student.STATE_WAITING);
				s.printState();
				waitingRoom.add(s);		
			}
			else {
				s.setState(Student.STATE_COMPUTERS);
				System.out.println("The office has no spots available the student --> " + s.getId()
				+ " will return to the computers room.b  ");			

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			semOffice.release();
			semWR.release();
		}
	}
	
	/**
	 * Method that allows the students that are waiting in line for the monitor
	 * to be attended when the monitor has finished attending the student at
	 * his office.
	 */
	public void addStudentToOfficeFromWR() {
		try {
			if(isOfficeEmpty() && !isWREmpty()) {
				Student s  =waitingRoom.poll();
				addStudentToOffice(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that returns the student that is in the office at the moment.
	 * Null if there is no student.
	 * @return Student that is in the office at the moment.
	 */
	
	public Student getStudentAtOffice() {
		return office.peek();
	}
	
}
