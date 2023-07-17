package edu.jsp.studentapp.view;

import java.util.List;
import java.util.Scanner;

import edu.jsp.studentapp.bean.Student;
import edu.jsp.studentapp.controller.StudentController;

public class StudentView {
	static {
		System.out.println("============WELCOME TO STUDENT APP=================");
	}
	
	public static Student enterStudentData(Scanner read)
	{
		System.out.println("Enter Student id:");
		int id=read.nextInt();
		System.out.println("Enter Student Name:");
		read.nextLine();
		String name=read.nextLine();
		System.out.println("Enter Student Email:");
		String email=read.nextLine();
		System.out.println("Enter Student PhoneNo:");
		long phoneNo=read.nextLong();
		System.out.println("Enter Student age:");
		int age=read.nextInt();
		
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setPhoneNo(phoneNo);
		s.setAge(age);
		
		return s;
	}
	
	public static void displayDetails(Student s)
	{
		System.out.println("============STUDENT DETAILS=======");
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("Email:"+s.getEmail());
		System.out.println("PhoneNo:"+s.getPhoneNo());
		System.out.println("Age:"+s.getAge());
		System.out.println("====================================");
	}
	
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		StudentController sc=new StudentController();
		while(true)
		{
			System.out.println("ENTER THE CHOICE:");
			System.out.println("1.addStudent\n2.FindStudent\n3.upddateStudent\n4.deleteStudent\n5.FindALL\n6.Exit");
			int choice=read.nextInt();
			switch (choice) {
			case 1:
				Student s=enterStudentData(read);
				sc.addStudent(s);
				System.out.println("STDUENT RECORD INSERTED....");
				break;
			case 2:
				System.out.println("Enter Student ID:");
				int id=read.nextInt();
				Student s1=sc.findStudentById(id);
				if(s1!=null)
					displayDetails(s1);
				else
					System.out.println("STUDENT RECORD NOT FOUND...");
				break;
			case 3:
				System.out.println("Enter Student Id:");
				int id1=read.nextInt();
				System.out.println("Enter new Age:");
				int age1=read.nextInt();
				boolean b=sc.updateStudentById(id1, age1);
				System.out.println(b?"UPDATED..":"STUDENT NOT FOUND...");
				break;
			case 4:
				System.out.println("Enter Student Id:");
				int id2=read.nextInt();
				boolean b1=sc.deleteStudentById(id2);
				System.out.println(b1?"DELETED":"STUDENT NOT FOUND...");
				break;
			case 5:
				List<Student> li=sc.findAll();
				for(Student s2:li)
				{
					if(s2!=null)
						displayDetails(s2);
				}
				break;
			case 6:
				System.out.println("===================THANK YOU=====================");
				return;
			default:
				System.out.println("YOUR ENTER WRONG CHOICE....");
				break;
			}
		}
	}
}
