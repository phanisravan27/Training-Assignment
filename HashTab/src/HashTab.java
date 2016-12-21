/* Program for to store 5 student records in to hashtsable and find out 
 * whose marks are highest*/
//Phani Sravan Kolapalli
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;
public class HashTab {
	public static void main(String args[]){
		Enumeration names;
		String key;
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		   ht.put("Sravan",94);
		   ht.put("Subbu", 79);
		   ht.put("Amulya", 89);
		   ht.put("Salma",99);
		   ht.put("sandeep",60);
		   
		   names = ht.keys();
		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println(key+ " marks: " + ht.get(key));
		      
		   }
		   Integer maxValue = Integer.MIN_VALUE;
		   String maxKey=null;
		   
		   for(Map.Entry<String, Integer> entry : ht.entrySet()) {
	             if(entry.getValue() > maxValue) {
	                 maxValue = entry.getValue();
	                 maxKey = entry.getKey();
	             }
		   }
		   System.out.println("The highest number of marks got by "+maxKey+" :" + maxValue);
	}
}
