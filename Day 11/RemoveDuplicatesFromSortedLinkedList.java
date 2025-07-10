class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    
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
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void buildList(int[] input){
        if(input.length == 0){
            head = null;
            return;
        }
        head = new Node(input[0]);
        Node tailNode = head;

        for(int i = 1; i < input.length; i++){
            tailNode.next = new Node(input[i]);
            tailNode = tailNode.next;
        }
    }

    public void removeDuplicates(){
        Node temp = head;
        while(temp.next.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        } 
    }
       
}
public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 5};
        LinkedList list = new LinkedList();
        list.buildList(arr);
        list.removeDuplicates();
        System.out.println(list);
    }
}
