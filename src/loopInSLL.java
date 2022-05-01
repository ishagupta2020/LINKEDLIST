public class loopInSLL {
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
        // find loop in SLL
    public boolean findLoop(){
            listNode slowPtr=head;
            listNode fastPtr=head;
            while(fastPtr!=null && fastPtr.next!= null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if (slowPtr == fastPtr) {
                    return true;
                }
            }
            return false;
    }

    // find start of loop
    public listNode getStartNode(){
        listNode slowPtr=head;
        listNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!= null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
               return  startOfLoop(slowPtr);

            }
        }
        return null;
    }
    public listNode startOfLoop(listNode slowPtr){
            listNode temp=head;
            while(temp!=slowPtr){
                temp=temp.next;
                slowPtr=slowPtr.next;
            }
            return temp;

    }
    //remove loop

    public void removeLoop(){
            listNode slowPtr=head;
            listNode fastPtr=head;
            while(fastPtr!=null && fastPtr.next!=null){
                fastPtr=fastPtr.next.next;
                slowPtr=slowPtr.next;
                if(fastPtr==slowPtr){
                    removeLoopInSLL(slowPtr);
                    return;
                }
            }

    }
    public void removeLoopInSLL(listNode slowPtr){
            listNode temp=head;
            while(temp.next!=slowPtr.next){
                temp=temp.next;
                slowPtr=slowPtr.next;
            }
            slowPtr.next=null;
    }



    public static void main(String[] args) {
            loopInSLL obj=new loopInSLL();
            obj.head=new listNode(1);
            listNode second=new listNode (2);
            listNode third=new listNode(3);
            listNode fourth=new listNode(4);
            listNode fifth=new listNode(5);
            obj.head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
            fifth.next=third;
            System.out.println(obj.findLoop());
        System.out.println(obj.getStartNode().data);
        obj.removeLoop();
        obj.display();

        }
    }




