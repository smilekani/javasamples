package in.co.kani;

import java.util.Date;

public final class CheckImmutability {
	private int id;
	private String name;
	private final Date joiningDate;

	/*public CheckImmutability() {
	}*/

	public CheckImmutability(int id, String name, Date joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.joiningDate = new Date(joiningDate.getTime());
	}

	public static void main(String[] args) {

		Date date = new Date();
		CheckImmutability immutability = new CheckImmutability(1, "Kani", date);
		System.out.println("Id : "+immutability.id);
		System.out.println("Name : "+immutability.name);
		System.out.println("Date : "+immutability.joiningDate);
		date.setYear(1990);
		System.out.println("Date : "+immutability.joiningDate);
	}
}