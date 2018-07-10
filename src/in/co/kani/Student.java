package in.co.kani;

public class Student implements Cloneable
{
	private String name;
	private int age;
	Course course;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, Course course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		
		Student student = (Student) super.clone();
		 
//        student.course = (Course) course.clone();
 
        return student;
	}




}
