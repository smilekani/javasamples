package in.co.kani;

public class Key {
	String key;
	
	public Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() { 
//		return (int)key.charAt(0);
		return  1;
		}

	@Override
	public boolean equals(Object obj) {
		System.out.println("obj = "+obj +"key = "+key);
		boolean equals = key.equals(((Key)obj).key);
		System.out.println("equals = "+equals);
		return equals;
		}

	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}
	
	
	
}
