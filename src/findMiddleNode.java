public class findMiddleNode {
    private listNode head;
        private static class listNode{
            private int data;
            private listNode next;
            public listNode(int data){
                this.data=data;
                this.next=null;

            }
        }
        public void display() {
            listNode current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }
        public listNode findMiddleNodeInSLL(listNode head){
            if(head==null){
                return null;
            }
            listNode slowPtr=head;
            listNode fastPtr=head;
            while(fastPtr!=null && fastPtr.next!=null){
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next.next;
            }
            return slowPtr;
        }
        // nth node from end
    public listNode nthNodeFromEnd(int n){
            if(head==null){
                return null;
        }
            if(n<=0){
                throw new IllegalArgumentException();
            }
            listNode refPtr=head;
            listNode mainPtr=head;
            int count=0;
            while(count<n){
                refPtr=refPtr.next;
                count++;
            }
            while(refPtr!=null){
                refPtr=refPtr.next;
                mainPtr=mainPtr.next;
            }
            return mainPtr;
    }
        public static void main(String[] args) {
            findMiddleNode obj=new findMiddleNode();
            obj.head=new listNode(5);
            listNode second=new listNode(1);
            listNode third=new listNode(12);
            listNode fourth=new listNode(7);
            listNode fifth=new listNode(14);
            obj.head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
            fifth.next=null;
            obj.display();
            listNode middleNode=obj.findMiddleNodeInSLL(obj.head);
            System.out.println(middleNode.data);
            listNode res=obj.nthNodeFromEnd(4);
            System.out.println("nth node from end where n=4  =>  "+res.data);

        }
    }


