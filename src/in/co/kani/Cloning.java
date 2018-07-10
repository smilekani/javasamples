package in.co.kani;

public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course = new Course("Eng", "Tam");
		Student student = new Student("kani", 27, course);
		Student stud1 = null;
		
		stud1 = (Student) student.clone();
		
		System.out.println("Course = "+student.course.sub1);
		
//		stud1.getCourse().setSub1("Maths");
		stud1.course.sub1 = "Maths";
		
		System.out.println("Course = "+student.course.sub1);
		
		
//		https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
		
	}
}
