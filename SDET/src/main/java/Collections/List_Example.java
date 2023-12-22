package Collections;



import java.util.ArrayList;
import java.util.LinkedList;


public class List_Example {

	public static void main(String[] args) {

		ArrayListExample();

	}

	public static void ArrayListExample() {

		ArrayList<String> As = new ArrayList<String>();

		//Rule 1 : It will allow duplicates
		//Rule 2 : It will maintain the insertion order
		//Rule 3 : Null can be allowed
//Best for search operation
		As.add("Hi");
		As.add(0, null);
		As.add("Hi");
		As.add("Hello");
		As.add("How");
		As.add("are");
		As.add("you");
		As.add(null);
		As.size();

		System.out.println(As);
		
		As.iterator();
		As.listIterator();
		As.listIterator(3);
		As.spliterator();
		
		As.remove(0);
		As.remove(null);
		
		As.clone();
		As.isEmpty();
		
		As.size();
		
		As.trimToSize();
		
		As.subList(0,5);
		
		As.contains(null);
		As.toArray();
		
		System.out.println(As);
		
		
	}

	public static void LinkedListExample() {

		LinkedList<Integer> linkedlist  = new LinkedList<Integer>();

		//1. It will maintain insertion order
		//2. It is better for insertion and deletion
		//3. It will allow duplicates
		//4. It will allow null as well
	//Best for Insert & delete operation	
		linkedlist.add(3);
		linkedlist.add(0, null);
		linkedlist.addFirst(null);
		linkedlist.addLast(8);
		
		linkedlist.get(0);
		linkedlist.getFirst();
		linkedlist.getLast();
		
		linkedlist.remove();
		linkedlist.remove(0);
		linkedlist.remove(null);
		linkedlist.removeFirst();
		linkedlist.removeLast();
		linkedlist.removeFirstOccurrence(null);
		linkedlist.removeLastOccurrence(null);
		
		linkedlist.lastIndexOf(null);
		
		linkedlist.descendingIterator();
		linkedlist.iterator();
		linkedlist.listIterator();
		linkedlist.listIterator(0);
		linkedlist.subList(0,4);
		
		linkedlist.isEmpty();
		
		//Implementing Dequeue functionality
		
		linkedlist.offer(null);       	//add at last
		linkedlist.offerFirst(null);	//add at first
		linkedlist.offerLast(null);		//add at last
		
		linkedlist.poll();			//remove first
		linkedlist.pollFirst();	    //remove first
		linkedlist.pollLast();	    //remove last
		
		linkedlist.peek();			//Retrieve first element
		linkedlist.peekFirst();		//Retrieve first element
		linkedlist.peekLast();		//Retrieve last element
		
		linkedlist.pop(); 			//remove the first element from the list and get that
		linkedlist.push(null);		//Insert the first element from the list and get that
	}



}
