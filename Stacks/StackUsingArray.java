
public class StackUsingArray {
    
    private int data[];
    private int top; // index of the top most element of the stack 

    public StackUsingArray(){
        data = new int[3];
        top = -1; // initially stack is empty;
    }

    public StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1; 
    }

    // to check if stack is empty or not
    public boolean isEmpty(){           // O(1)
        // if(top == -1) return true;
        // return false;
        return(top == -1);
    }

    // to get the size of stack
    public int size(){                  // O(1)
        return top+1;
    }

    // to get the top element
    public int top() throws StackEmptyException{        //O(1)
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        return data[top];
    }

    // insertion in stack
    public void push(int ele) throws StackFullException{        // ideally O(1) --> doubleCapacity O(n)
        if(size() == data.length){
            // //StackFullException 
            // StackFullException e = new StackFullException();
            // throw e;
            // double the capacity of array to store more elements
            doubleCapacity();
        }
        top++;
        data[top] = ele;
    }

    // doubleCapacity
    private void doubleCapacity(){      //O(1)
        int[] temp = data;
        data = new int[2*temp.length];
        for(int  i= 0 ; i <= top; i++){
            data[i] = temp[i];
        }
    }

    // deletion in stack
    public int pop() throws StackEmptyException{       // O(1)
        if(isEmpty()){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }

}
