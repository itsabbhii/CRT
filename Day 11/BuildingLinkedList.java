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
    
    
}
public class BuildingLinkedList {
    public static void main(String[] args) {
        int input[] = {10, 20, 30, 40, 50};
        LinkedList list = new LinkedList();
        list.buildList(input);
        System.out.println(list);
    }
}
