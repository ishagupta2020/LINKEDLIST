public class doublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    private static class Node{
        private int data;
        private Node next;
        private Node previous;
        public Node(int data){
            this.data=data;
        }
    }
    public doublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void displayForward(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(tail==null){
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.previous;
        }
        System.out.println("null");
    }
    public void insertAtBeginning(int data){
        Node newNode =new Node(data);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;

    }
    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    public Node deleteFirst(){
        Node temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }
    public Node deleteLast(){
        Node temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }

    public static void main(String[] args) {
        doublyLinkedList obj=new doublyLinkedList();
       // obj.insertAtBeginning(7);
     //   obj.insertAtBeginning(1);
     //   obj.insertAtBeginning(4);
     //   obj.insertAtBeginning(5);
     //   obj.insertAtBeginning(2);
      //  obj.displayForward();
        obj.insertAtLast(12);
        obj.insertAtLast(44);
        obj.insertAtLast(87);

      //  obj.displayForward();
        obj.deleteFirst();
        obj.displayForward();
        obj.deleteLast();
        obj.displayForward();

    }
    }

