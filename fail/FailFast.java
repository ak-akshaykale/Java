package fail;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	public static void main(String[] args) {
		ArrayList<String> as_str = new ArrayList<>();
		as_str.add("a");
		as_str.add("b");
		as_str.add("c");
		
		Iterator<String> iterator = as_str.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			as_str.add("f");
		}
	}

}
