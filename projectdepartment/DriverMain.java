package com.greatlearning.projectdepartment;
/** Main driver class creates object 
 * @author ishaAgarwal
 */
public class DriverMain {

	public static void main(String[] args)
	{	
	// objects of AdminDeparment
		SuperDepartment admin1= new AdminDepartment();// of superclass and object of child class
		System.out.println(" Welcome to "+admin1.departmentName());
		System.out.println(admin1.getTodaysWork());
		System.out.println(admin1.getWorkDeadline());
		System.out.println(admin1.isTodayAHoliday()+"\n");
		
	// objects of HrDepartment	
		SuperDepartment hr1= new HrDepartment();//Reference of superclass and object of child class
		System.out.println(" Welcome to "+hr1.departmentName());
		System.out.println( ((HrDepartment) hr1).doActivity());// casting as method is not in Super class SuperDpartment
		System.out.println(hr1.getTodaysWork());
		System.out.println(hr1.getWorkDeadline());
		System.out.println(hr1.isTodayAHoliday()+"\n\n");
		
	// objects of TechDepartment
		SuperDepartment tech1= new TechDepartment();//Reference of superclass and object of child class
		System.out.println(" Welcome to "+tech1.departmentName());
		System.out.println(tech1.getTodaysWork());
		System.out.println(tech1.getWorkDeadline());
		System.out.println(" "+((TechDepartment) tech1).getTechStackInformation());// casting as method is not in Super class SuperDpartment
		System.out.println(tech1.isTodayAHoliday());
		
		

	}

}
