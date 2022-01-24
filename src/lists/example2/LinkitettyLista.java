package lists.example2;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

class LinkitettyLista
{
	public static void main(String[] args)
	{
		String[] värit = {"musta", "punainen", "sininen"};
		
		LinkedList<String> variLista = new LinkedList<String>(Arrays.asList(värit));
		
		variLista.addLast("harmaa");
		variLista.add("keltainen");
		variLista.add(3, "vihreä");
		variLista.addFirst("valkoinen");
		variLista.addFirst("valkoinen");
		
		for(String s : variLista)
			System.out.printf("%s%n", s);
			System.out.println();
		
		int laskuri = Collections.frequency(variLista, "valkoinen");
		System.out.println("Monestiko listassa valkoinen? " + laskuri);
		
		variLista.remove("valkoinen");
			
		Collections.sort(variLista);
		
		Iterator<String> i = variLista.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
