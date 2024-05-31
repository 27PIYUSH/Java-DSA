public class QueueUsingArray {
    private int[] data;
    private int rear;   // index at which rear element is stored
    private int front;  // index at which front element is stored
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;  // initially
        rear = -1; 
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;  // initially
        rear = -1; 
        size = 0;
    }

    int size(){     // O(1)
        return size;
    }

    boolean isEmpty(){      // O(1)
        return (size == 0);
    }

    int front() throws QueueEmptyException{     // O(1)
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    int rear(){
        return data[rear];
    }

    void enqueue(int ele) throws QueueFullException{    // O(1)
        if(size == data.length){
            // throw new QueueFullException();
            doubleCapacity();
        }

        if(size == 0) {
            front = 0;
        }
        size++;
        // for circular queue --> if we try to insert after the last index we can reset the rear position to 0
        rear = (rear + 1) % data.length;
        // rear++; 
        // if(rear == data.length){
        //     rear = 0;
        // }
        data[rear] = ele;
    }

    private void doubleCapacity(){    // O(n)
        int[] temp = data;
        data = new int[2*temp.length];
        int idx = 0;
        for(int i = front ; i< temp.length ; i++){
            data[idx] = temp[i];
            idx++;
        }

        for(int i = 0 ; i<= front-1 ; i++){
            data[idx] = temp[i];
            idx++;
        }
        front = 0;
        rear = temp.length-1;
    }
 
    int dequeue() throws QueueEmptyException{     // O(1)
        if(size == 0){
            throw new QueueEmptyException();
        }

        int temp = data[front];
        front = (front + 1) % data.length;
        // front++;
        // if(front == data.length){
        //     front  = 0 ;
        // }

        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
