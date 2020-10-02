public class CircularlyLinkedList<E> { //set as generic list with <E>

    //variables
    private Node<E> tail = null;
    private int size = 0;

    //constructor
    public CircularlyLinkedList(){

    }

    //getters and setters
    public int size() {
        return size;
    }

    //methods
    public boolean isEmpty(){
        return size == 0;
    }

    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }

    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public void rotate(){ //changes head to tail && tail to head
        if(tail != null){
            tail = tail.getNext();
        }
    }

    public void addFirst(E e){ //add something to list
        if(isEmpty()){ //if list is empty
            tail = new Node<>(e, null); //takes in element e //because this is first thing in the list, the next is currently null
            tail.setNext(tail); //connect this to itself //as this is only item in list we must connect it circularly to itself
        }
        else{ //if list already has items
            Node<E> newest = new Node<>(e, tail.getNext()); //store input element e //get next item which is to connect to input e
            tail.setNext(newest); //set circularly
        }
        size++;
    }

    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();

        if(head == tail){
            tail = null;
        }
        else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

//    public static void printList(CircularlyLinkedList list){ //print list function
//        CircularlyLinkedList.Node<E> currentNode = list.head;
//
//        System.out.println("CircularlyLinkedList: ");
//        while(currentNode != null){
//            System.out.println(currentNode.data + " ");
//            currentNode = currentNode.next;
//        }
//    }
}
