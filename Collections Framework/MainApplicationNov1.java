
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainApplicationNov1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "Monday");
		map.put(2, "Tuesday");          // HeatMap used a bucket content like key:value
		map.put(3, "Wednesday");
		
		System.out.println(map);
		
//		Map<Integer, String> monthmap = new HashMap();
//		monthmap.put(1, "January");
//		monthmap.put(2, "February");          // HeatMap used a bucket content like key:value
//		monthmap.put(3, "March");
//		
//		monthmap.putAll(map);	
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			
			
			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();
			if(key>1) {
			
			System.out.println("Key is " + key  + " Value is " + value);
			}		
		}
		
		for(Map.Entry m: map.entrySet()) {
//			m.getKey();
//			m.getValue();
		}
	}

}
