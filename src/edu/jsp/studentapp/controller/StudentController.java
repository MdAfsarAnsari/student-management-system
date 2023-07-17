package edu.jsp.studentapp.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import edu.jsp.studentapp.bean.Student;
public class StudentController {
	private static List<Student> listOfStudent=new ArrayList<Student>();//data base
	
	public void addStudent(Student s)
	{
		listOfStudent.add(s);
//		System.out.println(listOfStudent.get(0));
	}
	
	public Student findStudentById(int id)
	{
		for(Student s:listOfStudent)
		{
			if(s.getId()==id)
			{
				return s;
			}
		}
		return null;
	}
	
	public boolean updateStudentById(int id,int newAge)
	{
		Student s=findStudentById(id);
		if(s!=null)
		{
			s.setAge(newAge);
			return true;
		}
	   return false;
	}
	public boolean deleteStudentById(int id)
	{
		Student s=findStudentById(id);
		if(s!=null)
		{
			listOfStudent.remove(s);
			return true;
		}
		return false;
	}
	
	public List<Student> findAll() {
		return listOfStudent;
	}

}
