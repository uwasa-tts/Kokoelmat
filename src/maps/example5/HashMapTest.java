package maps.example5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      hmap.put(100, "valkoinen");
	      hmap.put(101, "punainen");
	      hmap.put(102, "musta");
	      hmap.put(103, "sininen");
	      hmap.put(104, "oranssi");
	      
	      /* tulostetaan*/
	      System.out.println(hmap);
	      System.out.println("Määrä " + hmap.size());
		  
		  hmap.putIfAbsent(105, "keltainen");
		  hmap.putIfAbsent(105, "ruskea");
	      System.out.println(hmap);	      
	      // Haetaan avaimen perusteella
	      String color = hmap.get(103);
	      if(color != null)
	    	  System.out.println(color);
	      

}
}

