import java.util.*;
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
            return;
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
public class MergeLinkedList {
    static LinkedList merge(LinkedList list1, LinkedList list2){
        Node list1_ptr = list1.head, list2_ptr = list2.head;
        LinkedList ans = new LinkedList();
        while(list1_ptr!=null || list2_ptr!=null){
            if(list1_ptr == null ){
                ans.addLast(list2_ptr.data);
                list2_ptr = list2_ptr.next;
            }
            else if(list2_ptr == null){
                ans.addLast(list1_ptr.data);
                list1_ptr = list1_ptr.next;
            }else if(list1_ptr.data > list2_ptr.data){
                ans.addLast(list2_ptr.data);
                list2_ptr = list2_ptr.next;
            }else if(list1_ptr.data < list2_ptr.data){
                ans.addLast(list1_ptr.data);
                list1_ptr = list1_ptr.next;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        System.out.print("Enter no of elements in first linked list: ");
        int n1 = input.nextInt();
        System.out.print("Enter elements : ");
        for(int i = 0 ; i < n1 ; i++){
            list1.addLast(input.nextInt());
        }
        System.out.print("Enter no of elements in first linked list: ");
        int n2 = input.nextInt();
        System.out.print("Enter elements : ");
        for(int i = 0 ; i < n2 ; i++){
            list2.addLast(input.nextInt());
        }

        LinkedList merged = merge(list1, list2);
        System.out.println(merged);
        
    }
}
