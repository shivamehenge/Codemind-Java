
import java.util.*;
public class VectorIteration {
	public static void main(String args[]) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Shiva");
		vector.add("mehenge");
		
		System.out.println(vector);
		
		Iterator<String> itr = vector.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
