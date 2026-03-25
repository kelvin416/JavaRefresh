package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 */

class MyNode<T> {

    T data;

    MyNode<T> next;

    public MyNode(T data){
        this.data = data;
        this.next = null;
    }

//    we have to have an overloaded constructor
    public MyNode(T data, MyNode myNode){
        this.data = data;
        this.next = myNode;
    }
}


