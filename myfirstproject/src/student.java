
public class student {
	static int count=0;
	int studentId;
	String studentName;
	{
		count++;
	}
public static void main(String[] args) {
	System.out.println("STUDENT DETAILS");
		student s1=new student();
		s1.studentName="haritha";
		s1.studentId=101;
		System.out.println("studentName:"+s1.studentName);
		System.out.println("studentId:"+s1.studentId);
		student s2=new student();
		s2.studentName="hari";
		s2.studentId=102;
		System.out.println("studentName:"+s2.studentName);
		System.out.println("studentId:"+s2.studentId);
		System.out.println("object count"+count);
		
		
		
	}

}
