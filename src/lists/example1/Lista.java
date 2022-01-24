package lists.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lista {

	public static void main(String[] args) {

		List<String> kalat = new ArrayList<>();
		kalat.add("Ahven");
		kalat.add("Hauki");
		kalat.add("Kuha");
		
		if(kalat.contains("Hauki"))
			System.out.println("Hauki on kala");
		
//		kalat.remove("Kuha");
		Iterator i = kalat.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		// Kokoelman sis�lt� taulukkoon
		String[] kaloja = kalat.toArray(new String[kalat.size()]);
		
		
		// Muunnettaan listan sis�lt� suurilla kirjaimilla kirjoitetuksi
		ListIterator<String> it = kalat.listIterator();
		while(it.hasNext())
			it.set(it.next().toUpperCase());
		
		System.out.println("Tulostetaan j�rjestyksess�");
		ListIterator<String> ite = kalat.listIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("Tulostetaan k��nteisess� j�rjestyksess�");
		while(ite.hasPrevious())
			System.out.println(ite.previous());

		System.out.println("Lista sekaisin:");
		Collections.shuffle(kalat);
		System.out.println(kalat);
		System.out.println("Lista j�rjestyksess�:");
		Collections.sort(kalat);
		System.out.println(kalat);
		
		// l�pik�ynti for-each-silmukalla tulostaen sanan pituus ja sama lambda-lauseella
		for(String s: kalat)
			System.out.println(s + " pituus " + s.length());
		
	
		
	}

}