
public class Luci {
    static class Node {
        int val;
        Node next;

        Node(int v){
            this.val = v;
        }
    }

    //1>2>3>3>5>3
    public  Node removeMatchingNode(Node head, int value){
        if(head == null)
            return null;

        Node pre = null, curr = head;
        while(curr != null){
            if(curr.val == value){
                if(pre == null){
                    head = head.next;
                }else{
                     pre.next = curr.next;
                }
            }
            if(curr.val != value){
            pre = curr;
            } curr = curr.next;
        }
        return head;
    }
    public static void main(String arg[]){
        Luci luci = new Luci();
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(1);
        Node node6 = new Node(4);
        Node node7= new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        Node res = luci.removeMatchingNode(node1,1);

        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
