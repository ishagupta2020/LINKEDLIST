public class circularLinkedList {
    private node last;
    private int length;
    private static class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
        }
    }
    public circularLinkedList() {
        this.last = null;
        this.length = 0;
    }
public void createCircularLinkedList(){
        node a=new node(5);
    node b=new node(7);
    node c=new node(1);
    node d=new node(4);
    node e=new node(3);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=a;
    last=e;
    }
    public void display(){
        if(last==null){
            return;
        }
        node first=last.next;
        while(first!=last){
            System.out.print(first.data+"->");
            first=first.next;
        }
        System.out.println(first.data);
    }
    // insert node at beginning
    public void insertAtFirst(int data){
        node temp=new node(data);

        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public void insertAtLast(int data) {
        node temp = new node(data);
        if (last == null) {
            temp = last;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
    }
    public node deletetAtFirst(){
        node temp=last.next;
        if(last.next==last){
            last=null;
        }
        else {
            last.next = temp.next;
        }
            temp.next=null;
            length--;
            return temp;
    }
public static void main(String[] args) {
        circularLinkedList obj= new circularLinkedList();
        obj.createCircularLinkedList();
        obj.display();
        obj.insertAtFirst(22);
        obj.display();
        obj.insertAtLast(33);
        obj.display();
        obj.deletetAtFirst();
        obj.display();
    }
}
