package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport
{
	public String findGrades(Student studentObject)
	{
		int marks[]=studentObject.getMarks();
		int sum=0;
		for(int m:marks)
		{
			if(m<35)
				return "F";
			sum+=m;
		}
		if(sum<150)
			return "C";
		else if(sum<200)
			return "B";
		else if(sum<250)
			return "A";
		else
			return "A+";
	}
	public String validate(Student studentObject) throws NullStudentObjectException,NullMarksArrayException,NullNameException 
	{
		String result=" ";
		try
		{
			if(studentObject==null)
				throw new NullStudentObjectException();
			else
			{
				if(studentObject.getName()==null || studentObject.getName().isEmpty())
					throw new NullNameException();
				if(studentObject.getMarks()==null)
					throw new NullMarksArrayException();
				else
					result=findGrades(studentObject);
			}
		}
		catch(Exception e)
		{
			result=e.toString();
		}
		return result;
	}
}
