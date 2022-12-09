import java.util.ArrayList;
import java.util.Spliterator;

public class Java_Brushup5 {

	public static void main(String[] args) {
		// Dynamic Array with Spliterator
//	  ArrayList<Integer> Obj = new ArrayList<Integer>();
//      Obj.add(2);
//      Obj.add(245);
//      System.out.println(Obj.get(0));
//      System.out.println(Obj.get(1)); 
		
		ArrayList<String> S = new ArrayList<String>();
		S.add("Abdul");
		S.add("Khan");
		S.add("Irshad");
		S.add("Imran");
		S.add("Fayaz");
		Spliterator<String> SS= S.spliterator();
		SS.forEachRemaining(System.out::println);
		
	}

}
