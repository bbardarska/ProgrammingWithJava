import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class FindMiddle
{
    Node head;  // head of list
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            FindMiddle llist = new FindMiddle();
            //int n=Integer.parseInt(br.readLine());
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            GFG gfgobj = new GFG();
            //llist.head = new GFG().Middle(llist.head);
            System.out.println(gfgobj.getMiddle(llist.head));

            //llist.printList();

            t--;
        }
    }
}

class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
    {
        int numberOfNodes = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            numberOfNodes += 1;
        }
        Node newCurrent = head;
        for(int i=0; i<numberOfNodes/2; i++){
            newCurrent = newCurrent.next;
        }

        return newCurrent.data;

    }
}
