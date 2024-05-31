package LinkedList;


import java.util.Scanner;

public class LinkedList1 {
    
    // Create
    static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    
    // Print
    static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Increment
    static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    // Length
    static int length(Node<Integer> head){
        int count = 0;
        Node<Integer> temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print element at ith position
    static void Print_ith_node(Node<Integer> head, int i){
        Node<Integer> temp = head;
        int position = 0 ;
        while(temp != null && position < i){
            temp = temp.next;
            position++;
        }
        if(temp != null){
            System.out.println("Element at index "+i+" is "+temp.data);
        }
    }

    // Take input
    static Node<Integer> takeInput(){   // O(n^2) --> not optimised , O(n) --> optimised 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Linked List");
        int data = scn.nextInt();
        Node<Integer> head = null , tail = null; // reference for head & tail
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){ // condition for single node
                // Make this node head and tail node 
                head = currentNode;
                tail = currentNode;
            }
            else{
                // Node<Integer> tail = head; // start from head reaches the last node to connect with the other new nodes
                // while(tail.next != null){
                //     tail = tail.next;
                // }
                // // now tail will refer to the last node 
                // // connect current node with the last node
                tail.next = currentNode;
                // tail = currentNode;
                tail = tail.next;
                
                // Optimised

            }
            data = scn.nextInt();
        }
        return head;
    }

    // Insert Node
    static Node<Integer> insertNode(Node<Integer> head , int pos , int data){
        int currPos = 0;
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node<Integer> temp = head;
        while( temp != null && currPos < pos-1){
            temp = temp.next;
            currPos++;
        }
        if(temp == null){
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete Node
    static Node<Integer> deleteNode(Node<Integer> head , int pos){

        if(head == null){  // Special case 1 --> ‘head’ node is null: an empty linked list has been passed
            return head;
        }

        if(pos < 0){  // Special case 2 --> The index is out of bounds of the linked list: The index is negative or it’s greater than or equal to the size of the linked list.
            return head;
        }

        if(pos == 0){  // edge case --> The node to be deleted is the head node
            return head.next;
        }

        int currPos = 0;
        Node<Integer> currentNode = head;
        while( currentNode != null && currPos < pos-1){
            currentNode = currentNode.next;
            currPos++;
        }
        if(currentNode == null || currentNode.next == null){ // Special case 2
            return head;
        }

        currentNode.next = currentNode.next.next;
        return head;
    }

    // Find a Node in Linked List
    static int findNode(Node<Integer> head , int num){
        if(head == null){
            return -1;
        }
        int currPos = 0;
        while(head != null){
            if(head.data.equals(num)){
                return currPos;
            }
                head = head.next;
                currPos++;
            }
        return -1;
    }

    // AppendLastNToFirst
    static Node<Integer> AppendLastNToFirst(Node<Integer> head , int n){
        // // method 1::: 
        // if(n==0 || head == null){
        //     return head;
        // }

        // Node<Integer> temp = head;
        // // to calculate length
        // int count = 0; 
        // while(temp != null){
        //     temp = temp.next;
        //     count++;
        // }

        // Node<Integer> temp1 = head;
        // int currentPos = 0;
        // int len = count - n;
        // while(currentPos < len-1 ){
        //     temp1 = temp1.next;
        //     currentPos++; 
        // }
        // Node<Integer> temp2 = temp1.next;
        // Node<Integer> head2 = temp1.next;
        // while(temp2.next != null){
        //     temp2 = temp2.next; 
        // }

        // temp2.next = head;
        // temp1.next = null;
        // return head2;

        // fast and slow pointer::: method 2
        if(n==0 || head == null){
            return head;
        }
        Node<Integer> initialHead = head;
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        for(int  i=0 ; i<n ; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node<Integer> head2 = slow.next;
        slow.next = null;
        fast.next = initialHead;
        head = head2;
        return head;
    }

    // Eliminate Duplicates
    static Node<Integer> eleminateDuplicates(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> currentHead = head;
        while(currentHead.next != null){
            if(currentHead.data.equals(currentHead.next.data)){
                currentHead.next = currentHead.next.next;
            }
            else{
                currentHead = currentHead.next;
            }
        }
        return head;
    }

    // Reverse LinkedList
    static void reverseLinkedList(Node<Integer> head){
        if(head == null){
            return;
        }
        reverseLinkedList(head.next);
        System.out.print(head.data + " ");
    }

    // Palindrome check
    static Node<Integer> reverseLL(Node<Integer> head){
        Node<Integer> currentNode = head;  // ek ek krke reverse hota jaayega 
        Node<Integer> prev = null;
        Node<Integer> fwd = null;
        while(currentNode != null){
            fwd = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = fwd;
        }
        return prev;
    }

    static boolean isPalindrome(Node<Integer> head){

        // find the middle of the LL
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the 2nd half of the LL
        Node<Integer> head2 = slow.next;
        slow.next = null;
        head2 = reverseLL(head2);

        // compare two subList
        Node<Integer> firstSubList = head;
        Node<Integer> secondSubList = head2;
        while(firstSubList != null && secondSubList !=null) {
            if(firstSubList.data != secondSubList.data){
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }

        // rejoin and restore the original list
        head2 = reverseLL(head2);
        slow.next = head2;
        return true;
    }


    public static void main(String[] args) {
        // Node<Integer> head = createLinkedList();
        Node<Integer> head = takeInput();
        // increment(head);
        // System.out.print("incremented: ");
        // printLinkedList(head);
        // System.out.println("Length of LL: "+ length(head)); 
        // Print_ith_node(head, 2);
        // System.out.print("Insert Node: ");
        // insertNode(head, 3, 69);
        // printLinkedList(head);
        // System.out.print("Delete Node: ");
        // deleteNode(head, 0);
        // printLinkedList(head);
        // System.out.println(findNode(head , 6));
        // printLinkedList(AppendLastNToFirst(head , 3));
        // printLinkedList(eleminateDuplicates(head));
        // reverseLinkedList(head);
        System.out.println(isPalindrome(head));
    }
}
