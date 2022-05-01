public class reverseLinkedList {
    private listNode head;
    private static class listNode{
        private int data;
        private listNode next;
        public listNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void display(listNode head){
        listNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
public listNode reverse(listNode head){
        listNode current=head;
        listNode previous=null;
        listNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
}
    public static void main(String[] args) {
        reverseLinkedList obj=new reverseLinkedList();
        obj.head=new listNode(6);
        listNode second=new listNode(8);
        listNode third=new listNode(9);
        listNode fourth=new listNode(1);
        listNode fifth=new listNode(11);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;
        obj.display(obj.head);
        listNode result=obj.reverse(obj.head);
        obj.display(result);


    }
}
