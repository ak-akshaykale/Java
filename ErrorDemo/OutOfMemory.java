package ErrorDemo;

public class OutOfMemory {

	public static void main(String[] args) {
		//java.lang.OutOfMemoryError
		//Requested array size exceeds VM limit at Error
		Integer i[] = new Integer[Integer.MAX_VALUE];
		System.out.println(i[Integer.MAX_VALUE-1]);
	}

}
