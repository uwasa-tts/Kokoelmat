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
	      System.out.println("M‰‰r‰ " + hmap.size());
		  
		  hmap.putIfAbsent(105, "keltainen");
		  hmap.putIfAbsent(105, "ruskea");
	      System.out.println(hmap);	      
	      // Haetaan avaimen perusteella
	      String color = hmap.get(103);
	      if(color != null)
	    	  System.out.println(color);
	      
	      // Using the default natural ordering of sorted map Integer key which implement Comparable interface
	   /*   System.out.println("\nJ‰rjestetty Map nousevassa j‰rjestyksess‰...");
	      SortedMap ascSortedMap = new TreeMap();
	      ascSortedMap.putAll(hmap);
	      printMap(ascSortedMap);
	   
	      
	      // Tulostetaan for-each-toistolla
	      for(
	    		  
	    		  
	      // Display content using Iterator
	      Set<Entry<Integer, String>> set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Entry mentry = (Entry)iterator.next();
	         System.out.print("avain on: "+ mentry.getKey() + " ja arvo on ");
	         System.out.println(mentry.getValue());
	      }

	      // Remove values based on key
	      hmap.remove(3);
	      System.out.println("Avaimet ja arvot poiston j‰lkeen");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Entry mentry2 = (Entry)iterator2.next();
	          System.out.print("Avain on "+mentry2.getKey() + " ja arvo on ");
	          System.out.println(mentry2.getValue());
	       }

	}
	
/*	public static void printMap(SortedMap ascSortedMap) {
	        for (Set entry : ascSortedMap.entrySet()) {
	            System.out.println("Key : " + entry.getKey() + " Value : "
	                    + entry.getValue());
	        }
*/
}
}

