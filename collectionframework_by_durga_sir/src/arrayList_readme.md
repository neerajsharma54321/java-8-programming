If we know the length or number of records in advance then we will go for array not for arraylist.

Suppose Collection have the 10 element have size and we want to add 1 more element then In that case 
all the element from the first list will be added to the other element. All the element of the first list
will be gone for garbage collection.

Suppose If the collection have 1 crore element and we want to add one more element and the size is full then in that case
all the 1 crore element will be copied from 1st list to other new list.

So, Collection list operation is so expensive.

Difference b/w Array and Collections

______________________________________________________________
	Array							| 			Collection |
--------------------------------------------------------------
1	Fixed in size					|	Growable in nature
2 	wrt to memory 	X				|	wrt memory is good
3	Performance is good				|	bad
4	Only Homogeneous				|	Heterogeneous
5 	Underlying DS not available		|	Available
6	Array can hold primitive/ object|	only object
_______________________________________________________________

What is collection ?
If we want to represent a group of individual objects as a single entity then we should go for Collections.

----------------------------|
	student1				|
			student2		|				|
							|
	student3				| It is the collection of Student.
							|
							|
			student4		|
							|
-----------------------------

	9 Key interfaces of collection framework.
	1.	Collection (I) - provides most common methods 
		check collection_interface.png image 

_______________________________________________________________

	Difference b/w Collection and Collections

	Collection							|			Collections
	It is an interface						While it is the Class
												It is the utility class and several utility methods are available 												for Collection.
												Example: Collections.sort(arrayList);
										
	2. List : When duplicates elements are allow and insertion order must be preserved then we will go for 
				List interface.
			
			  Collection (I) (1.2 v)
				  |
			    List (I) (1.2 v)
		   /	  |		  \
		  /		  |	   	   \
	  	 /(1.2v) |        \
	ArrayList	LinkedList	 Vector 1.0v
					1.2v			\
								Stack 1.0v
		
	Note: Vector and Stack concepts came in 1.0 v therefore these classes known as legacy class. The classes which are coming from old generation those are called Legacy classes.
	
	3. Set: If we don't allow duplicate object and insertion order is not the issue then we will go for Set 			  interface.
	
	  		Collection (1.2 v)
				  |
			    Set (1.2 v)
		   		  |		  
		  		  |	   	  
	  			  |      
				HashSet (1.2v)
				  |		  
		  		  |	   	  
	  			  |      
				LinkedHashSet (1.4v)
		
		#Differenc b/w List and Set
		______________________________________________________
		List								|		Set				   |
		______________________________________________________|	
		1. Duplicate are allowed		|		not allowed
		2. Insertion order preserved	|		insertion order not preserved
		___________________________________________________________________
		
	4. SortedSet:- Without duplicate object if we want to store object in some sorted order then we will 
					go for SortedSet. SortedSet is the child interface of Set.
						
				Collection (1.2 v)
				  |
			    Set (1.2 v)
		   		  |		  
		  		  |	   	  
	  			  |      
				SortedSet (1.2v)
	
	5. NavigableSet:- is the child interface of SortedSet. It have the several method to navigate the 		object. 
	
			Collection (1.2 v)
				  |
			    Set (1.2 v)
		   		  |		  
		  		  |	   	  
	  			SortedSet (1.2v)
				  |		  
		  		  |	   	  
	  			NavigableSet (1.6v)
	  			  |		  
		  		  |
			  	TreeSet (1.2 v)
	
	
	6. Queue:- If we want to represent a group of individual objects prior to processing then we should go
				for Queue.
				 
	
	  				Collection (I) (1.2 v)
				  		|
			 _______Queue______(I) (1.5 v)
		   /	  				  \
		  /		  			   	   \
	  	 /(1.5v) 		       	 \
	PriorityQueue			 BlockingQueue (1.5v)
										|
										|---LinkedBlockingQueue (1.5v)
										|
										|---PriorityBlockingQuer (1.5v)
										
	======================================================================================================								
	| Note:- All the above interfaces (List, Collection, Set, SortedSet, NavigableSet, Queue) meant for  | 	|		representing the a group of individual objects.														   |
	| If we want to represent a group of objects as key and value pair then we will go for Map interface.|
	|=====================================================================================================

	7. Map interface: If we want to represent the group of object as key and value pair then we will go 		for Map. Duplicate keys are not allowed but value can be duplicates.
		Please note, Map is not the child interface of Collection interface.
		
					 
			 _______Map_1.2v_________________________________________________	Dictionary 1.0v
		   /	  				  \						|							|	 /
		  /		  			   		\					|							|	/
	  	 /(1.2v) 		       	 \					|							| /
	HashMap			 	WeakHashMap(1.2v)  IdentityHashMap 1.4v		HashTable 1.0v
		|																			|
		|																			|
	LinkedHashMap	1.4v														Properties 1.0v
	
		
	Dictionary, HashTable and Properties are the Legacy classes.
	
	8. SortedMap (I) :- If we want to represent a group of key and value pairs according to some sorting 
		Order of keys then we should go for SortedMap.
		
				  Map (I) 1.2v	 		
					|																			
					|																			
				SortedMap 1.2v
	
	
	8. NavigableMap (I) :- It is the child interface of SortedMap, It defines the several utility methods 			for navigation purpose.
	
		
				  Map (I) 1.2v	 		
					|																			
					|		 																	
				SortedMap (I)1.2v
					|																			
					|		 																	
				NavigableMap (I) 1.6v
					|																			
					|		 																	
				TreeMap 1.2v (implemented class)
	
	  
		
Any Collection class already implements Serialization and Clonable interface.
