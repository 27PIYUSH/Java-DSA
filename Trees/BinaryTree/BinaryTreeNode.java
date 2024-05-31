package Trees.BinaryTree;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;  // automatically null
    public BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data){
        this.data = data;
    }
}
