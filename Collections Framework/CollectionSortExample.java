

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class CollectionSortExample {

	private static final String Collection = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stdlist = new ArrayList<String>();
		stdlist.add("Shiva");
		stdlist.add("Sham");
		stdlist.add("Kunal");
		stdlist.add("Kartik");
		stdlist.add("Rohan");
		
		System.out.println(stdlist);
		
		List<Integer> intlist = new ArrayList<Integer>();
		intlist = Arrays.asList(10,30,20,60,40,30);
		
		Collections.sort(stdlist);
		Collections.sort(intlist);
		System.out.println(stdlist);
		System.out.println(intlist);
	}

}
