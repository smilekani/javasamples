package in.co.kani;

public class MapObject {
	
	private int no;
	
	public MapObject() {
	}
	
	public MapObject(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	
	
	@Override
	public int hashCode() {
		return 0;
	}

	
/*	
	@Override
	public boolean equals(Object obj) {
		
		boolean equals = Integer.valueOf(no).equals((Integer)obj);
		System.out.println("equals = "+equals);
		return equals;
		}*/

	@Override
	public String toString() {
		return "MapObject [no=" + no + "]";
	}
	
	

}
