package in.co.kani;

public class Course implements Cloneable {
	String sub1;
	String sub2;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String sub1, String sub2) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
