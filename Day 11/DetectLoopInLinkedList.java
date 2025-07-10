
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

    public void print(){
        Node temp = head;
        int count = 0;
        while(temp.next!=null && count<100){
            System.out.print(temp.data+" ");
            temp = temp.next;
            count++;
        }
    }
    
    public boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public Node removeCycle(){
        Node slow = head;
        Node fast = head;
        // to detect position of where cycle is detected
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        // to get the starting point of cycle
        slow = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        // to detect the end point of cycle
        while(fast.next != slow){
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }
    
    
    
}
public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(7);
        Node n3 = new Node(3);
        Node n4 = new Node(6);
        LinkedList list = new LinkedList();
        list.head = n1;
        n1.next = n2;n2.next = n3;n3.next = n4; n4.next = n2;
        String ans = list.isCyclic() ? "Cycle is detected" : "No cycle is detected";
        System.out.println(ans); 
        // list.print();
        list.removeCycle();
        System.out.println(list);       
    }   
}
