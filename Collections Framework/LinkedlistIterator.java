import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistIterator {

	public static void main(String[] args) {
		
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("Shiva");
		linked.add("Mehenge");
		
		System.out.println(linked);
		
		Iterator<String> itr = linked.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
