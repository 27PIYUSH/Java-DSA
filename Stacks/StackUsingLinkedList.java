public class StackUsingLinkedList<T> {
    
    private Node<T> head;
    private int size;

    public StackUsingLinkedList(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }
     
    T top() throws StackEmptyException{
        if(size()==0){
            throw new StackEmptyException();
        }
        return head.data;
    }

    boolean isEmpty(){
        return(size() == 0);
    }

    void push(T element){
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() throws StackEmptyException{
        if(isEmpty()){
            // StackEmptyException
            throw new StackEmptyException(); 
        }
        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }
}
