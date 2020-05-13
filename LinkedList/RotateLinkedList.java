
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i==0)
                {
                    head = new Node(a);
                    tail = head;
                }
                else{
                    tail.next = new Node(a);
                    tail = tail.next;
                }
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class Rotate {

    /*  This function should rotate list counter-
   clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.
        Node current = head;
        int count = 1;
        while(count < k && current != null){
            current = current.next;
            count += 1;
        }
        Node kthNode = current;
        while(current.next != null){
            current = current.next;
        }
        current.next = head;
        head = kthNode.next;
        kthNode.next = null;

        return head;
    }
}
