package com.javaintro;

public class student {
//      declaration
//	    instance variables
	int sid;
	String Sname;
//	static variables
	static int collegeId;
	static String collegeName;
	public static void main(String[] args) {
		System.out.println("main method started!");
		System.out.println("student information from VCUBE");
//	accessing static data
		`
		student srinu=new student();
		collegeId=555;
		collegeName="VCUBE";
		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		srinu.sid=101;
		srinu.Sname="srinivas.s";
		//		accessing instance data
		System.out.println("studentId:"+srinu.sid);
		System.out.println("studentname:"+srinu.Sname);
		
		
		// TODO Auto-generated method stub

	}

}
