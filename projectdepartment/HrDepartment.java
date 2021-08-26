package com.greatlearning.projectdepartment;
/** HrDepartment holds 4 method
 */

public class HrDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return"HR Department";
	}
	
	public String getTodaysWork()
	{
		return "Fill today's worksheet and mark your attendence";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String doActivity()
	{
		return "team Lunch";
	}
}
