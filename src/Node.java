public class Node<E> { //<E> is placeholder //Whatever type we pass into node is going to be in place of where we type E

    //variables
    private E element; //essentially data element
    private Node<E> next; //represents next thing in linkedlist

    //constructor
    public Node(E e, Node<E> n){ //takes in element and next node
        element = e;
        next = n;
    }

    //getters and setters
    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }

    //methods

}
