package Trees.GenericTree;

import java.util.ArrayList;

public class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;  // arraylist -> data -> t type

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}