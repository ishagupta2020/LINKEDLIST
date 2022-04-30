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
    //remove duplicate from sll
    public Node removeDuplicate(){
        Node dummy=new Node(-1);
Node prev=dummy;
Node current=head;
while(current!=null) {
    if (current.next != null && current.data == current.next.data) {
        while (current.next != null && current.data == current.next.data) {
            current = current.next;
        }
        prev.next = current.next;


    } else {
        prev = prev.next;
    }
    current = current.next;
}
return dummy.next;
    }
    public static void main(String[] args) {
        insertNodeInSortedSll obj=new insertNodeInSortedSll();
        obj.head=new Node(4);
        Node second=new Node(6);
        Node third=new Node(8);
        Node fourth=new Node(8);
        Node fifth=new Node(8);
        Node sixth=new Node(8);

        Node seventh=new Node(9);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=null;


        obj.insertInSortedSLL(7);
        obj.display();
        obj.removeDuplicate();
        obj.display();

    }
}
