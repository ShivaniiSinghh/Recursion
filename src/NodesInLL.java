class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class NodesInLL {
    Node head;
    public void add(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
        public int getcountRec(Node node){
            if (node == null)
                return 0;
            return 1+ getcountRec(node.next);
        }
        public int getcount(){
            return getcountRec(head);
        }
    public static void main(String[] args) {
        NodesInLL nl = new NodesInLL();
        nl.add(1);
        nl.add(2);
        nl.add(3);
        nl.add(4);
        System.out.println("No. of nodes are : " +nl.getcount());
    }
}
