package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet_Example();
		// LinkedHashSet_Example();
		 TreeHashSet_Example();
	}

	public static void HashSet_Example() {

		HashSet<Integer> hashset = new HashSet<>();
		//1.It will not maintain insertion order
		//2.It won't allow duplicates
		//3.one null can be allowed
		hashset.add(2);
		hashset.add(3);
		hashset.add(5);
		hashset.add(null);
		hashset.add(9);
		hashset.add(0);
		hashset.add(-2);
		hashset.add(null);
		hashset.add(2);		
		System.out.println(hashset);	
		
		hashset.isEmpty();
		hashset.iterator();
		hashset.toArray();
		hashset.spliterator();
		hashset.remove(null);	
		
	}

	public static void LinkedHashSet_Example() {

		LinkedHashSet<Integer> hashset = new LinkedHashSet<>();
		//1.It will  maintain insertion order
		//2.It won't allow duplicates
		//3.one null can be allowed
		hashset.add(2);
		hashset.add(3);
		hashset.add(5);
		hashset.add(null);
		hashset.add(9);
		hashset.add(0);
		hashset.add(-2);
		hashset.add(null);
		hashset.add(2);	
		
		System.out.println(hashset);	
		
		
	}
	
	public static void TreeHashSet_Example() {

		TreeSet<Integer> hashset = new TreeSet<>();
		//1.It will  maintain insertion order
		//2.It won't allow duplicates
		//3.one null can be allowed
		hashset.add(2);
		hashset.add(3);
		hashset.add(5);
		//hashset.add(null);
		hashset.add(9);
		hashset.add(0);
		hashset.add(-2);
		//hashset.add(null);
		hashset.add(2);	
		
		System.out.println(hashset);
		System.out.println(hashset.first());   //get first element
		System.out.println(hashset.last());   //get last element
		System.out.println(hashset.pollFirst());   //Reterive first element and remove it from set
		System.out.println(hashset);
		System.out.println(hashset.pollLast());  //Reterive last element and remove it from set
		System.out.println(hashset);
		System.out.println("--"+hashset.higher(3));   
		System.out.println(hashset);
		System.out.println("--"+hashset.lower(3));
		System.out.println(hashset);
		System.out.println("-Floor-"+hashset.floor(5));
		System.out.println(hashset);
		System.out.println("-Ceiling-"+hashset.ceiling(-2));
		System.out.println(hashset); 			
	}

}
