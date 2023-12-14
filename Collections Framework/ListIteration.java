import java.util.*;

public class ListIteration {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Shiva");
		list.add("Sanjay");
		list.add("Prajwal");
		list.add("Divya");
		
		Collections.sort(list);
		System.out.println(list);
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
