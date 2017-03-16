import java.util.*;
public class Duplicate {
public static void main(String args[]){
	ArrayList<String>a=new ArrayList<String>();
	a.add("Papan");
	a.add("Samim");
	a.add("Papan");
	a.add("Faruk");
	Iterator<String> itr=a.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
  }
}