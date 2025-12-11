public class LL1 {
    Node head;
    class  Node{
        String data;
        Node next;
        

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add --> first,last
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data){
       Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
         Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void deleteLst(){
        if(head==null){
            System.out.println("list empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        Node secLst = head;
        Node lstNode = head.next;
        while(lstNode.next!=null){
              lstNode = lstNode.next;
              secLst = secLst.next;
        }
        secLst.next = null;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("is");
        list.addFirst("girl");
        list.addFirst("a");
        list.addLast("dancing");
        list.printList();
        list.deleteLst();
        list.printList();
    }
}
