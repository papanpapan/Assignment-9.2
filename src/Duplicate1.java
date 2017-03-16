import java.util.HashSet;
import java.util.Iterator;
public class Duplicate1 {
public static void main(String args[]){
	HashSet<String>al=new HashSet<String>();
	al.add("Papan");
	al.add("Samim");
	al.add("Papan");
	al.add("Faruk");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
       }
    }
}