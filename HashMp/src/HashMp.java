// Phani Srvan Kolapalli
//Program  for HashMap
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMp {

	public static void main(String args[]){
	
		HashMap<String,Integer > hmap =new HashMap<String, Integer>();
		hmap.put("Sravan", new Integer(1));
		hmap.put("Subbu", new Integer(2));
		hmap.put("Salma", new Integer(3));
		hmap.put("Amulya", new Integer(4));
		hmap.put("Sandeep", new Integer(5));
		
		hmap.put(null, null);
		Set<Map.Entry<String, Integer>> set =hmap.entrySet();
		
		for(Map.Entry<String, Integer> group : set){
			System.out.println(group.getKey() + ":" + group.getValue());
		}
		
		

	}
}
