package maps.example5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapTest2 {

	public static void main(String[] args) {

		Map<String, Auto> autot = new HashMap<String, Auto>();
		
		Auto auto1 = new Auto("Volvo", "ABC-123", 2015);
		Auto auto2 = new Auto("Audi", "CFG-365", 2017);
		Auto auto3 = new Auto("Wolkswagen", "HTK-888", 2011);
		Auto auto4 = new Auto("Volvo", "AFD-342", 2005);
		
		autot.put(auto1.getRekNro(), auto1);
		autot.put(auto2.getRekNro(), auto2);
		autot.put(auto3.getRekNro(), auto3);
		autot.put(auto4.getRekNro(), auto4);
		
		System.out.println("Autoja : " + autot.size());
		
		// tulostetaan auton merkki rekisterin perusteella
		Auto auto = autot.get("AFD-342");
		if(auto != null)
			System.out.println("Auton merkki rekisterille " + auto.getRekNro() + " on " + auto.getMerkki());
		
		System.out.println(autot);
		
		Set<Map.Entry<String, Auto>> entryset = autot.entrySet();
		Iterator<Map.Entry<String, Auto>> iterator = entryset.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, Auto> e = iterator.next();
			System.out.println(e.getKey() + " " + e.getValue().getMerkki());
		}
		
		// tulostus toisin
		System.out.println("Tulostus toisin:");
		for(Entry<String, Auto> entry: autot.entrySet()){    
	        String avain = entry.getKey();  
	        Auto arvo = entry.getValue();  
	        System.out.println(avain + " " + arvo.getMerkki());   
		}
		
		/*
		 * TreeMap - avaimen mukaan järjestyksessä
		 */
		System.out.println("Tulostus TreeMap:");
		SortedMap<String, Auto> puuKartta = new TreeMap<String, Auto>(autot);
//		System.out.println(puuKartta);
		for(Entry<String, Auto> entry: puuKartta.entrySet()){    
	        String avain = entry.getKey();  
	        Auto arvo = entry.getValue();  
	        System.out.println(avain + " " + arvo.getMerkki());   
		}

	}

}
