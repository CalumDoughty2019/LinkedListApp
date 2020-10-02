import java.util.LinkedList;

public class SingularlyLinkedList implements Cloneable{ //implements Cloneable class for clone
    //variables
    private Node head;
    private static int size;

    //getters and setters
    public int size() {
        return size;
    }

    static class Node{
        int data; //could be class, integer, string, bankAccounts, anything
        Node next; //link to the next node in the list

        //constructor
        Node(int data){
            this.data = data; //initialise data
            next = null; //initialise next value in list (only 1 here at the moment so null)
        }
    }


    public static SingularlyLinkedList insert(SingularlyLinkedList list, int data){ //will return a SingularlyLinkedList //takes in current SingularlyLinkedList && data that we wish to add to it
        Node newNode = new Node(data); //use constructor to pass node
        newNode.next = null; //this is the new end of the list so we want null

        if(list.head == null){ //if nothing in list
            list.head = newNode; //initialise the list by setting newNode to new head of the list //this is a special case that only happens when the list is actually empty
        }
        else{
            Node last = list.head; //want to get the last node inserted
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
        return list;
    }

    public static void printList(SingularlyLinkedList list){ //print list function
        Node currentNode = list.head;

        System.out.println("LinkedList: ");
        while(currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public boolean equals(Object o){ //check if lists are equal
        if(o == null){ //cant be equal if one is empty/not instantiated
            return false;
        }
        if(getClass() != o.getClass()){ //cant be equal if classes arent the same (if we have linkedlist and not-linkedlist then they cannot be equal)
            return false;
        }
        SingularlyLinkedList other = (SingularlyLinkedList) o; //cast object as a linkedlist so we can access fields and methods of the class
        if(size != other.size){ //cant be equal if not the same size
            return false;
        }

        Node nodeA = head; //start of list A
        Node nodeB = other.head; //start of list B
        while(nodeA != null){
            if(nodeA.data != nodeB.data){ //check these values for equivalency
                return false;
            }
            nodeA = nodeA.next; //set to next value for another comparison
            nodeB = nodeB.next; //set to next value for another comparison
        }
        return true;
    }

    public SingularlyLinkedList clone() throws CloneNotSupportedException{ //clone is a method inherited form the object class //we are overriding this
        SingularlyLinkedList other = (SingularlyLinkedList)super.clone(); //this calls clone method from the super class(object class in this case) //we need to cast this object as linkedlist
        if(size > 0){
            other.head = new Node(head.data); //taking the data from the head position of the first list AND setting that to head position of second list
            Node nodeA = head.next; //get next node (we have already set head)
            Node otherNode = other.head;
            while(nodeA != null){
                Node newest = new Node(nodeA.data); //set new node which has the data from nodeA
                otherNode.next = newest; //set next node of otherNode to match from nodeA
                nodeA = nodeA.next; //get next value of nodeA
            }
        }
        return other;
    }

//    public void rotate(){ //changes head to tail && tail to head
//        if(head != null){
//
//            head = head.next;
//        }
//    }
}
