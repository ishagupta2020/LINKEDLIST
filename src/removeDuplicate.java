public class removeDuplicate {


            private Node head;
            private static class Node{
                private int data;
                private Node next;
                public Node(int data){
                    this.data=data;
                    this.next=null;
                }
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
            public void removeDuplicate() {
                Node current = head;
                if(head==null){
                    return ;
                }
                while (current != null && current.next != null) {
                    if (current.data == current.next.data) {
                        current.next = current.next.next;
                    } else {
                        current = current.next;
                    }


                }

            }

            public static void main(String[] args) {
                removeDuplicate obj=new removeDuplicate();
                obj.head=new Node(4);
                Node second=new Node(6);
                Node third=new Node(8);
                Node fourth=new Node(8);

                Node fifth=new Node(9);
                obj.head.next=second;
                second.next=third;
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=null;
                obj.removeDuplicate();
                obj.display();

            }
        }




