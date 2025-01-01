package Patterns.MyHashMapImplAndMyLinkedListImpl;

public class MyLinkedList<V>{
    Node head;
    Node tail;
    int size;

    public class Node{
        V value;
        Node next;
        public Node(){

        }
        public Node(Node next,V value) {
            this.next = next;
            this.value = value;
        }
    }

    public void add(V value){
        Node node =new Node();
        node.value=value;
        node.next=null;
        if(head==null){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public V removeFirst(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return null;
        }else if(size==1){
            V val=head.value;
            head=null;
            size--;
            return val;
        }
        else{
            V val=head.value;
            head=head.next;
            size--;
            return val;
        }

    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }


    public V removeLast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return null;
        }else if(size==1){
            Node curr=head;
            V val= head.value;
            head=null;
            size--;
            return val;
        }
        else{

            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            V val=curr.next.value;
            curr.next=null;
            size--;
            return val;
        }
    }
    public void display(){
        if(size==0){
            System.out.println("LinkedList is Empty !!");
        }
        else{
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.value+" ");
            curr=curr.next;
        }
        System.out.println();
        }
    }

}
