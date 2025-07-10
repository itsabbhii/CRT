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

    public Node sortList(){
        Node temp = head;
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();       
        while(temp!=null){
            if(temp.data%2 == 0){
                list1.addLast(temp.data);
            }else{
                list2.addLast(temp.data);
            }
            temp = temp.next;
        }
        Node lastNode = list1.head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = list2.head;
        return list1.head;
    }

    public void sortListWithoutCreatingtherList(){
        Node temp = head, dummy = head, prev = head;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
            if(temp.data% 2 == 0){
                prev.next = temp.next;
                temp.next = dummy.next;
                dummy.next = temp;
                dummy = dummy.next;
            }
        }
    }
       
}
public class EvenAndOddNodes {
    public static void main(String[] args) {
        int[] input = {6, 5, 3, 4, 7, 1, 2};
        LinkedList list = new LinkedList();
        list.buildList(input);
        list.sortListWithoutCreatingtherList();
        System.out.println(list);
        // System.out.println(list);
    }
}
