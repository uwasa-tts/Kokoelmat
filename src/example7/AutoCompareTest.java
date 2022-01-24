package example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AutoCompareTest {

	public static void main(String[] args) {
				
		Auto auto1 = new Auto("Volvo", "RBC-123", 2015);
		Auto auto2 = new Auto("Audi", "CFG-365", 2017);
		Auto auto3 = new Auto("Wolkswagen", "HTK-888", 2011);
		Auto auto4 = new Auto("Volvo", "AFD-342", 2005);
		
		List<Auto> autot = new ArrayList<Auto>();
		autot.add(auto1);
		autot.add(auto2);
		autot.add(auto3);
		autot.add(auto4);
		
		System.out.println("Alkuper‰isess‰ j‰rjestyksess‰");
		Iterator i = autot.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		// j‰rjestet‰‰n oliot rekisterinumeron mukaiseen j‰rjestykseen
		/*Collections.sort(autot);
		
		System.out.println("Rekisterin  mukaisessa j‰rjestyksess‰");		
		Iterator it = autot.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		*/
		System.out.println("Comparator-rajapinta");
		Collections.sort(autot, new Comparator<Auto>(){
			public int compare(Auto auto1, Auto auto2){
				return auto1.getRekNro().compareTo(auto2.getRekNro());

       }
		});
		System.out.println("Rekisterin  mukaisessa j‰rjestyksess‰");		
		Iterator it = autot.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}

