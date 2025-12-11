public class Sll2 {
    int val;
    Sll2 next;
    Sll2(){}
    Sll2(int val){
        this.val = val;
    }
    Sll2(int val,Sll2 next){
        this.val  =val;
        this.next = next;
    }
}

class LL{
    public Sll2 remNthFromLst(Sll2 head, int n){
          if(head.next==null){
            return null;
          } 
          int size =0;
          Sll2 curr = head;
          while(curr != null){
              curr = curr.next;
              size++;
          }
          if(n==size){
            return head.next;
          }
          int idxToSearch = size - n;
          Sll2 prev =head;
          int i=1;
          while(i<idxToSearch){
            prev = prev.next;
            i++;
          }
          prev.next = prev.next.next;
          return head;
    
}
    public static void main(String[] args) {
           LL list = new LL();

        Sll2 node5 = new Sll2(5);
        Sll2 node4 = new Sll2(4, node5);
        Sll2 node3 = new Sll2(3, node4);
        Sll2 node2 = new Sll2(2, node3);
        Sll2 head = new Sll2(1, node2);

        
        head = list.remNthFromLst(head, 2);

        Sll2 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}