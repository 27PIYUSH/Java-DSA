package LinkedList;

import java.util.Scanner;

public class Assignment {
    
    // Take input
    public static Node<Integer> takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Linked List");
        int data = scn.nextInt();
        Node<Integer> head = null , tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else{
                tail.next = currentNode;
                tail = tail.next;
            }
            data = scn.nextInt();
        }
        return head;
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

    // find node recursively
    static int findNode(Node<Integer> head , int data){
        if(head == null) return -1;

        if(head.data.equals(data)) return 0;

        int count = findNode(head.next, data);
        
        if(count == -1) return -1;
    
        return count+1;
    }

    // even after odd
    static Node<Integer> oddEven(Node<Integer> head){
        if(head == null || head.next == null) return head;
        Node<Integer> oddHead = null , evenHead = null , oddtail = null , eventail = null;
        while(head != null){
            if(head.data % 2 == 0){
                if(evenHead == null){
                    evenHead = head ;
                    eventail = head;
                } else{
                    eventail.next = head;
                    eventail = eventail.next;
                }
            } else {
                if(oddHead == null){
                    oddHead = head;
                    oddtail = head;
                } else{
                    oddtail.next = head;
                    oddtail = oddtail.next; 
                }
            }
            head = head.next;
        }
        if(oddHead == null) return evenHead;
        else {
            oddtail.next = evenHead;
        }
        if(evenHead != null) eventail.next = null;
        return oddHead;
    }
    
    // Delete ever n nodes
    static Node<Integer> deleteEveryNNode(Node<Integer> head, int m, int n){
        if(m==0 || head == null) return null;
        if(n==0) return head ;
        Node<Integer> curr = head;
        Node<Integer> del = null;
        while(curr != null){
            int take = 0;
            int skip = 0;
            // for m 
            while(take < m-1 && curr != null){
                curr = curr.next;
                take++;
            }

            if(curr == null) break; // if ther are less elements than m

            del = curr.next;
            while(skip < n && del != null){
                del = del.next;
                skip++;
            }
            curr.next = del;
            curr = del;
        }
        return head;
    }

    // swap two nodes of ll
    static Node<Integer> swap2Node(Node<Integer> head , int i , int j){
        if(i == j) return head;
        
        Node<Integer> curr = head , swap1 = head ,swap2 = head , prev1 = head , prev2 = head;
        
        int pos = 0 ;
        while(curr != null){
            if(pos == i-1){
                prev1 = curr;
                swap1 = prev1.next;
            }
            if(pos == j-1){
                prev2 = curr;
                swap2 = prev2.next;
            }
            curr = curr.next;
            pos++;
        }
        prev1.next = swap2;
        prev2.next = swap1;
        swap1.next = swap2.next;
        swap2.next = prev2;

        return head;
    }

    // k reverse
    static Node<Integer> kreverse(Node<Integer> head, int k){
        if (k == 0 || k == 1) return head;

        Node<Integer> curr = head;
        Node<Integer> fwd = null;
        Node<Integer> prev = null;

        int count = 0;

        while(count < k && curr != null){
            fwd  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            count++;
        }

        if(fwd != null){
            head.next = kreverse(fwd, k);
        }

        return prev;
    }

    // bubble sort
    static Node<Integer> bubbleSort(Node<Integer> head){
        int n = 0 ;
        Node<Integer> currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            n++;
        }
        
        for(int i= 0 ; i<n-1 ; i++){
            Node<Integer> prev = null;
            Node<Integer> curr = head;
            for(int j = 0 ; j<n-i-1 ; j++){
                if(curr.data <= curr.next.data){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    if(prev == null){
                        Node<Integer> next = curr.next;
                        head = head.next;
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                    } else {
                        Node<Integer> next = curr.next;
                        prev.next = next;
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                    }
                }
            }
        }
        return head;
    } 

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        // System.out.println(findNode(head, 23));
        // printLinkedList(oddEven(head));
        // printLinkedList(deleteEveryNNode(head, 2, 2));
        // printLinkedList(swap2Node(head, 1, 3));
        // printLinkedList(kreverse(head, 3));
        printLinkedList(bubbleSort(head));
    }
}
