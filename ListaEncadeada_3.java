import java.util.LinkedList;

public class ListaEncadeada_3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		int j = 0;
		
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		
		System.out.println( "Elementos ->" + l);
		
		for( int a = 0; a < l.size() ; a++ )	{			
			j = j + l.get( a );
		}
		System.out.println( "Soma dos elementos da lista -> " + j );
	}
}
