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

    public Node middleNode(){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
}
public class MiddleNodeOfLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        list.buildList(input);
        Node middle = list.middleNode();
        if(input.length %2 ==1) System.out.println("Middle Node is: "+middle.data);
        else System.out.println("Midlle Nodes are: "+middle.data+" & "+middle.next.data);
    }
}
