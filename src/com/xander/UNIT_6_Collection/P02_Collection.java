package com.xander.UNIT_6_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class P02_Collection {

    /* // Notes
     *
     * Collection:
     * 
     *   - Collection is an interface
     *   - It represents a group of objects known as its elements. For example, a list of integers.
     * 
     * Collections:
     *   - Collections is a class
     *   - Java Collections Framework provides a standard way to handle a group of objects.
     *   - Collection framework is a class that provides an architecture to store and manipulate the group of objects.
     * 
     * Collection (I)
     *      |
     *      + List (I)
     *      |
     *      + Set (I)
     *      |
     *      + Queue (I)
     * 
     * Common methods of Collection interface:
     * 
     *      + add(Object o): Appends the specified element to the end of the list.
     *      + addAll(Collection c): Appends all of the elements in the specified collection to 
     *        the end of this list, in the order that they are returned by the specified collection's iterator.
     *      
     *      + remove(Object o): Removes the first occurrence of the specified element from the list.
     *      + removeAll(Collection c): Removes all of the elements from the list that are present in 
     *        the specified collection.
     * 
     *      + clear(): Removes all of the elements from the list.
     *      + isEmpty(): Returns true if the list is empty.
     *      + size(): Returns the number of elements in the list.
     *      + contains(Object o): Returns true if the list contains the specified element.
     *      + containsAll(Collection c): Returns true if the list contains all of the elements in the specified collection.
     */

    public void listDisplay() {
        /*
         * List:
         *      - List is an interface
         *      - Insertion order is preserved
         *      - It is an ordered collection of objects in which duplicate values can be stored.
         *      - Duplicate values can be stored.
         *      - List interface is implemented by ArrayList, LinkedList, Vector, and Stack classes.
         *
         * List interface methods: 
         *      + add(int index, Object element): Inserts the specified element at the specified 
         *        position in the list.
         *      + addAll(int index, Collection c): Inserts all of the elements in the specified
         *      + remove(int index): Removes the element at the specified position in the list.
         *      + get(int index): Returns the element at the specified position in the list.
         *      + set(int index, Object element): Replaces the element at the specified position in 
         *        the list with the specified element.
         *      + indexOf(Object o): Returns the index of the first occurrence of the specified element in the list.
         *      + lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list.
         * 
         *  List (I)
         *      |
         *      + ArrayList (C)
         *      |
         *      + LinkedList (C)
         *      |
         *      + Vector (C)
         *      |
         *      + Stack (C)
         * 
         */
        List<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300); 
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addAll(l1); // add all elements of l1 to list
        
        System.out.println("List : " + list);
        System.out.println("List Size: " + list.size());
        System.out.println("List Empty: " + list.isEmpty());
        System.out.println("List contains 10: " + list.contains(10));

        //remove elements from list
        list.remove(2);
        list.removeAll(l1);

        //remove by value
        list.remove(list.indexOf(20));

        //get element by index
        System.out.println("List : " + list);   
        System.out.println("Element at index 0: " + list.get(0));

        //set element by index
        list.set(0, 11);

        //print all elements using for iterator
        System.out.println("Printing all elements using for iterator");

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();


        //print all elements using for each loop
        System.out.println("Printing all elements using for each loop");
        for(int i : list) {
            System.out.println(i);
        }
        System.out.println();

        //print all elements using for loop
        System.out.println("Printing all elements using for loop");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    
    public void listUtilDisplay() {
        /*
         * Using collections utility class for additional functionalities such as sort, reverse, etc.
         * 
         * Collections methods:
         * 
         *    + sort(List list): Sorts the list in ascending order.
         *    + reverse(List list): Reverses the order of elements in the list.
         *    + shuffle(List list): Randomly permutes the list.
         *    + swap(List list, int i, int j): Swaps the elements at the specified positions in the list.
         */

         List<Integer> list = new ArrayList<>();
         list.add(23);
         list.add(34);
         list.add(27);
         list.add(52);
         list.add(86);
         list.add(45);
         list.add(49);

        System.out.println("Original list: " + list);


        /*
         * sort the list
         */

         List<Integer> sortedList = new ArrayList<>();
         sortedList.addAll(list);

         Collections.sort(sortedList); // sort the list
         Collections.reverse(sortedList);

        System.out.println("Sorted list: " + sortedList);

    }

    public void setDisplay() {
        /*
         * Set:
         *      - Set is an interface
         *      - Insertion order is not preserved
         *      - It is an unordered collection of objects in which duplicate values cannot be stored.
         *      - Set interface is implemented by HashSet, LinkedHashSet, and TreeSet classes.
         * 
         *  Set (I)
         *      |
         *      + HashSet (C)
         *      |
         *      + LinkedHashSet (C)
         *      |
         *      + TreeSet (C)
         * 
         */
    }

    public void queueDisplay() {
        /*
         * Queue:
         *      - Queue is an interface
         *      - It is used to hold the elements about to be processed and provides various operations like the insertion, removal, etc.
         *      - Queue interface is implemented by PriorityQueue, Deque, and ArrayDeque classes.
         * 
         *  Queue (I)
         *      |
         *      + PriorityQueue (C)
         *      |
         *      + Deque (I)
         *      |
         *      + ArrayDeque (C)
         * 
         */
    }

    //Map is independent of Collection interface
    public void mapDisplay() {
        /*
         * Map:
         *      - Map is an interface
         *      - It is not a subtype of the Collection interface.
         *      - It represents a mapping between a key and a value.
         *      - Each key and value pair is known as an entry.
         *      - A Map contains unique keys, but values can be duplicated.
         *      - Map interface is implemented by HashMap, LinkedHashMap, TreeMap, Hashtable, and Properties classes.
         * 
         *  Map (I)
         *      |
         *      + HashMap (C)
         *      |
         *      + LinkedHashMap (C)
         *      |
         *      + TreeMap (C)
         *      |
         *      + Hashtable (C)
         *      |
         *      + Properties (C)
         * 
         */
    }

}
