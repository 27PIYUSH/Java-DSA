package LinkedList;

import java.util.Scanner;

public class LinkedList2 {
    
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

    // insert recursively
    public static Node<Integer> insertAt(Node<Integer> head , int pos , int data){
        if(head == null && pos > 0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode = new Node<Integer>(data);
            newNode.next = head;
            return newNode;
        }
        else{
            // Node<Integer> smallHead = insertAt(head.next, pos-1, data);
            // head.next = smallHead;
            head.next = insertAt(head.next, pos-1, data);
            return head;
        }
    }

    // delete recursively
    static Node<Integer> deletNode(Node<Integer> head, int pos){
        if(head == null) return head;
        if(pos == 0){
            return head.next;
        }
        else{
            head.next = deletNode(head.next, pos-1);
            return head;
        }
    }
    
    // reverse recursively
    static Node<Integer> reverse(Node<Integer> head){
        if(head == null || head.next == null) return head;
        else{
            Node<Integer> reversedHead = reverse(head.next);
            Node<Integer> reversedTail = head.next;
            reversedTail.next = head;
            head.next = null;
            return reversedHead;
        }
    }

    // mid point of ll
    static Node<Integer> mid(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while(fast.next != null && fast.next.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge two sorted ll
    static Node<Integer> merge(Node<Integer> l1 , Node<Integer> l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        Node<Integer> newHead = null , newTail = null;

        // point the new node to the smaller node
        if(l1.data < l2.data){
            newHead = l1;
            newTail = l1;
            l1 = l1.next;
        } else{
            newHead = l2;
            newTail = l2;
            l2 = l2.next;
        }

        // change the connections of the nodes 
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                newTail.next = l1;
                newTail = newTail.next;
                l1 = l1.next;
            }else{
                newTail.next = l2;
                newTail = newTail.next;
                l2 = l2.next;
            }
        }

        if(l1 != null){
            newTail.next = l1;
        }

        if(l2 != null){
            newTail.next = l2;
        }
        return newHead;
    }

    // merge sort
    static Node<Integer> mergeSort(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> mid = mid(head);
        Node<Integer> half1 = head;
        Node<Integer> half2 = mid.next;
        mid.next = null;
        
        half1 = mergeSort(half1);
        half2 = mergeSort(half2);
        Node<Integer> finalHead = merge(half1, half2);
        return finalHead;
    }


    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        // Node<Integer> l1 = takeInput();
        // Node<Integer> l2 = takeInput();
        // printLinkedList(insertAt(head, 0, 97));
        // printLinkedList(deletNode(head, 1));
        // printLinkedList(reverse(head));
        // Node<Integer> mid = mid(head);
        // System.out.println(mid.data);
        // printLinkedList(merge(l1, l2));
        printLinkedList(mergeSort(head));
    }
}
