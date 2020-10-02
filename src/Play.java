import java.util.LinkedList;

public class Play {
    public static void main(String[] args){
        SingularlyLinkedList list = new SingularlyLinkedList();
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 7);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 8);
        list = list.insert(list, 9);
        list.printList(list);
        System.out.println("Size of List: " + list.size());
        list.rotate();
        list.printList(list);
        System.out.println("Size of List: " + list.size());

        CircularlyLinkedList cList = new CircularlyLinkedList();
        cList.addFirst( 1);
        cList.addFirst( 3);
        cList.addFirst( 5);
        cList.addFirst( 7);
        cList.addFirst( 2);
        System.out.println("");
        System.out.println("Size of CircularlyList: " + cList.size());
    }
}
