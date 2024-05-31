public class QueueUsingLinkedList<T> {
    
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return (size == 0);
    }

    T front() throws QueueEmptyException{
        if(front == null){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if(size == 0){
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    T dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }

        if(size == 1){
            rear = null;
        }
        
        T temp = front.data;
        front = front.next;
        size--;
        return temp;
    }
}
