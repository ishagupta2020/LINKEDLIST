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
    // insert node at the beginning of Singlylinkedlist
    public void insert(int data){
        listNode newNode=new listNode(data);
        newNode.next=head;
        head=newNode;

    }
    // insert node at the end of singlylinkedlist
    public void insertAtEnd(int value){
        listNode newNode=new listNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        listNode current=head;
        while(current.next!=null){
            current=current.next;

        }
        current.next=newNode;
    }
public void insertAtPosition(int value,int position){
        listNode newNode=new listNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else {
            listNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            listNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
}
public listNode deleteAtBeginning(){
        if(head==null){
            return null;
        }
        listNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
}
public listNode deleteAtEnd(){
        if(head==null || head.next==null){
            return head;
        }
        listNode current=head;
        listNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
}
public listNode deleteAtPosition(int position){
        if(position==1){
            head=head=head.next;
        }
        listNode previous=head;
        int count=1;
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        listNode current=previous.next;
        previous.next=current.next;
        return current;
}
public listNode removeKey(int key){
        listNode current=head;
        listNode temp=null;
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(head==null){
            return null;
        }
        temp.next=current.next;
        return current;
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
        obj.insert(11);
        obj.display();
        obj.insertAtEnd(22);
        obj.display();
        obj.insertAtPosition(33,5);
obj.display();
obj.deleteAtBeginning();
obj.display();
obj.deleteAtEnd();
obj.display();
obj.deleteAtPosition(4);
obj.display();
obj.removeKey(20);
obj.display();
    }
    }
