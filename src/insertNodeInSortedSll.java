public class insertNodeInSortedSll {
    private Node head;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node insertInSortedSLL(int data){
    Node newNode=new Node(data);
    Node temp=null;
    Node current=head;
    while(current!=null && current.data<newNode.data) {
        temp = current;
        current = current.next;
    }
    newNode.next=current;
    temp.next=newNode;
    return head;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertNodeInSortedSll obj=new insertNodeInSortedSll();
        obj.head=new Node(4);
        Node second=new Node(6);
        Node third=new Node(8);
        Node fourth=new Node(9);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        obj.insertInSortedSLL(7);
        obj.display();

    }
}
