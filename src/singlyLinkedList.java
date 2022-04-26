public class singlyLinkedList {
    private listNode head;
    private static class listNode{
        private int data;
        private listNode next;

    public listNode(int data) {
        this.data = data;
        this.next = null;
    }
    }
    public void display(){
        listNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    // length  of linked list
    public int length() {
        int count = 0;
        listNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public static void main(String[] args) {
        singlyLinkedList obj = new singlyLinkedList();
        obj.head = new listNode(10);
        listNode second=new listNode(20);
        listNode third=new listNode(30);
        listNode fourth=new listNode(40);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        obj.display();
        System.out.println(obj.length());
    }
    }
