package fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> ll = new CopyOnWriteArrayList();
		ll.add("as");
		ll.add("ad");
		ll.add("az");
		Iterator<String> iterator = ll.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			ll.add("gt");
		}
		System.out.println(ll);
	}

}
