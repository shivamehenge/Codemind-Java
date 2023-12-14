import java.util.Iterator;
import java.util.Stack;

public class StatckIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Shiva");
		stack.push("Dagdu");
		stack.push("mehenge");
		stack.push("FullName");
		
		stack.pop();
		
		Iterator<String> itr = stack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
