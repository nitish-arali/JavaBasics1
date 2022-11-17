package LinkedList;

public class BasicNodeClassProgram {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void display() {
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
        public void add(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public Node getNodeAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;
        }
        public void reverse(){
            int li=0;
            int ri=size-1;

            while(li<ri){
                Node left=getNodeAt(li);
                Node right=getNodeAt(ri);

                int temp=left.data;
                left.data=right.data;
                right.data=temp;

                li++;
                ri--;
            }
        }
        void addFirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();

        list.addFirst(0);
        list.display();

        list.reverse();
        list.display();



        list.reverse();
        list.display();

    }
}
