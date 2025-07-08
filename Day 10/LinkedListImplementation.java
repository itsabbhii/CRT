
class Node{
    int data;
    Node next;
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data, head);
        head = newNode;
    }

    @Override
    public String toString() {
        String  list = "";
        Node temp = head;
        while(temp != null){
            list+=temp.data+" ";
            temp = temp.next;
        } 
        return list;
    }

    public void addLast(int data){
        Node newNode = new Node(data, null);
        Node temp = head;
        if(head == null){
            head = newNode;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(int data){
        if(head == null){
            System.out.println("Can't delete "+data+" from empty linked list");
            return;
        }
        if(head.data == data){
            head = head.next;
            System.out.println("Deleted "+data+" Linked list empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                Node toDelete = temp.next;
                temp.next = temp.next.next;
                toDelete.next = null;
                System.out.println("Deleted "+data+" from linked list");
                return;
            }
            temp = temp.next;
        }
    }

    public int searchElement(int data){
        Node temp = head;
        int pos = 1;
        while (temp != null) {  
            if(temp.data == data){
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }
    
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addFirst(40);
        list.addLast(50);
        System.out.println(list);
        list.delete(40);
        System.out.println(list);
        list.delete(30);
        System.out.println(list);
        System.out.println(list.searchElement(10));
    }    
}
