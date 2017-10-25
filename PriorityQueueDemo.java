package employee;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(16);
		// adding numbers into PriorityQueue in arbitrary order
		pq.add(3); 
		pq.add(7);
		pq.add(2);
		pq.add(4);
		pq.add(1);
		pq.add(5);
		
		  
	    	System.out.println("PriorityQueue list"+pq);
	    	
		   

		// Now, let's if PriorityQueue keeps the smallest
		// element in head or not. Let's use peek method
		// to check that, peek() returns the head of the
		// queue 
		             Integer head = pq.peek();
		
		                System.out.println("head of the PriorityQueue : " + head); // 1 
		// Now, let's remove the head and see what comes
		// next, you can use poll() method to remove
		// element from head
		    head = pq.poll(); // 1
	     	head = pq.peek();
	            	System.out.println("Current value of head : " + head);
		
		// Iterating over PriorityQueue, iterator returned 
		// by PriorityQueue doesn't guarantee any order
		
		         Iterator<Integer> iterator = pq.iterator(); 
	              	System.out.println("Iterating over PriorityQueue");
		// object next() :it returns the element and moves the cursor pointer to next element.
	    			
	              	while(iterator.hasNext()){
			System.out.println(iterator.next());
		    } 
	}

}
