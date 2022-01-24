package queue.example6;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class JonoTesti {

	public static void main(String[] args) {
		
		Queue<String> jono = new LinkedList<String>();
		
		jono.add("valkoinen");
		jono.add("sininen");
		jono.add("keltainen");
		jono.add("musta");
		jono.add("oranssi");
		
		System.out.println("Jonossa ovat: " + jono);  
		// hakee ensimm�isen elementin, ei poista
		System.out.println("jonon ensimm�inen: " + jono.element());
		
		System.out.println("poistettu jonosta: " + jono.remove());
		
		System.out.println("jonon ensimm�inen: " + jono.element());
		
		System.out.println("Jono l�pik�ynti:");
		Iterator itr=jono.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		// poistaa jonon ensimm�isen, palauttaa null jos jono tyhj�
		System.out.println("poistettu jonosta: " + jono.poll());
		// noutaa ensimm�isen, ei poista, palauttaa null jos jono tyhj�
		System.out.println("jonon ensimm�inen: " + jono.peek());
		
		System.out.println("Jonossa ovat: " + jono);
		
		
		/* PriorityQueue*/
				
		System.out.println("\nPriorityQueue - jono 2");
		PriorityQueue<String> jono2 = new PriorityQueue<String>();  
		
		jono2.add("valkoinen");
		jono2.add("sininen");
		jono2.add("keltainen");
		jono2.add("musta");
		jono2.add("oranssi");
		
		System.out.println("Jonossa 2 ovat: " + jono2);  

		System.out.println("jonon 2 ensimm�inen: " + jono2.element());
		
		System.out.println("poistettu jonosta 2: " + jono2.remove());
		
		System.out.println("jonon 2 ensimm�inen: " + jono2.element());
		
		System.out.println("Jonon 2 l�pik�ynti:");
		Iterator it=jono2.iterator();  
		while(it.hasNext()){  
		System.out.println(it.next());  
		}
		
		System.out.println("poistettu jonosta 2: " + jono2.poll());
		System.out.println("jonon 2 ensimm�inen: " + jono2.peek());
		
		System.out.println("Jonossa 2 ovat: " + jono2);
	}  
}


