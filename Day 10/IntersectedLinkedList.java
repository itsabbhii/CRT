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
    public int length(){
        int length = 0;
        if(head == null) return 0;
        Node temp = head;
        while(temp != null){
            temp=temp.next;
            length++;
        }
        return length;
    }
    
}
public class IntersectedLinkedList{
    public static void main(String[] args) {
        Node n1 = new Node(4, null);
        Node n2 = new Node(8, null);
        Node n3 = new Node(15, null);
        Node n4 = new Node(42, null);
        Node n5 = new Node(99, null);
        Node n6 = new Node(16, null);
        Node n7 = new Node(23, null);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n6.next = n7; n7.next = n4;
        LinkedList list1 = new LinkedList();
        list1.head = n1;
        LinkedList list2 = new LinkedList();
        list2.head = n6;

        int l1 = list1.length(), l2 = list2.length();

        Node temp = (l1 > l2) ? list1.head : list2.head;

        System.out.println("List 1: " +list1 +"\nList 2: " +list2);
        int i = 0;
        int abs_l = (l1 > l2) ? l1-l2 : l2-l1;
        while(i < abs_l){
            temp = temp.next;
            i++;
        }
        Node list1_ptr = temp, list2_ptr = list2.head;
        while(list1_ptr != list2_ptr){
            list1_ptr = list1_ptr.next;
            list2_ptr = list2_ptr.next;
        }
        System.out.println("Intersection at : "+list1_ptr.data);
        
    }
    
}
