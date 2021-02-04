
import java.util.LinkedList;

public class ListaEncadeada_2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		int j = 0;
		
		l.add(2);
		l.add(4);
		l.add(6);
		l.add(8);
		l.add(10);
		l.add(12);
		l.add(14);
		l.add(16);
		l.add(18);
		
		System.out.println( "Elementos da lista -> " + l );


		for( int a = 0; a < l.size() ; a++ )	{
			
			if ( j < l.get(a))	
				j = l.get(a);
			}
			
			System.out.println("Maior elemento ->  " + j);
		}
	}



