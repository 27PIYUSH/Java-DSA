package Trees.GenericTree;
import java.util.*;

public class TreeUse {

    // creating tree  --> recursively
    static TreeNode<Integer> takeInput(Scanner scn){ 
        System.out.print("Enter next node data: ");
        int data = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(data);
        System.out.println("Enter the no. of children for "+ data);
        int childCount = scn.nextInt();
        for(int  i = 0; i < childCount; i++){
            TreeNode<Integer> child = takeInput(scn);
            root.children.add(child);
        }
        return root;
    }

    // printing tree --> recursively
    public static void print(TreeNode<Integer> root){
        if (root == null) return;
        String s = root.data + ":";
        for(int  i = 0; i<root.children.size(); i++){
            s = s + root.children.get(i).data + " ";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    // taking input level wise
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter root data: ");
        int rootData = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.println("Enter the no. of chilren of "+ frontNode.data);
            int numChild = scn.nextInt();
            for(int i = 0; i<numChild ; i++){
                System.out.println("Enter "+ (i+1) + "th child of "+ frontNode.data);
                int childData = scn.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    // find no. of nodes
    public static int countNodes(TreeNode<Integer> root){
        // edge case --> if root node is null
        if(root == null){
            return 0;
        }

        int count = 1; // initially the count is one as the root node
        for(int  i = 0; i<root.children.size(); i++){
            count += countNodes(root.children.get(i));
        }
        return count;  // there is no need of base case as the for loop will only work if there is a child
    }

    // Node with Largest data
    public static int largestDataNode(TreeNode<Integer> root){
        if(root == null) return Integer.MIN_VALUE;
        int max = root.data;

        // Recursively find the largest value in the subtree rooted at the current child
        for(int i = 0; i<root.children.size(); i++){
            int childMax = largestDataNode(root.children.get(i));
            max = Math.max(max,childMax);
        }
        return max;
    }

    // Find Height
    public static int height(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int maxheight = 1;
        for(int i = 0; i<root.children.size(); i++){
            int small = 1 + height(root.children.get(i));
            if(maxheight<small){
                maxheight=small;
            }
        }
        
        return maxheight;
    }

    // printing all nodes at depth k
    public static void printNodesAtK(TreeNode<Integer> root, int k){
        if(k<0) return;
        if(k==0){
            System.out.println(root.data);
            return;
        } 
        for(int i = 0; i<root.children.size(); i++){
            printNodesAtK(root.children.get(i), k-1);
        }
    }

    // count leaf nodes  
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null) return 0;
        if(root.children.size() == 0) return 1;
        int count = 0;
        for(int i = 0; i<root.children.size(); i++){
            count += countLeafNodes(root.children.get(i));
        }
        return count;
    }

    // Tree Traversal 
    // Pre order --> Root Left Right 
    public static void preOrderTraversal(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        for(int i = 0 ;i<root.children.size(); i++){
            preOrderTraversal(root.children.get(i));
        }
    }

    // Post Order
    public static void postOrderTraversal(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        for(int i = 0 ;i<root.children.size(); i++){
            preOrderTraversal(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<>(4);
        // TreeNode<Integer> node1 = new TreeNode<>(3);
        // TreeNode<Integer> node2 = new TreeNode<>(7);
        // TreeNode<Integer> node3 = new TreeNode<>(9);
        // TreeNode<Integer> node4 = new TreeNode<>(5);
        
        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println(root);

        // Scanner scn = new Scanner(System.in);
        // TreeNode<Integer> root = takeInput(scn);
        TreeNode<Integer> root = takeInputLevelWise();
        // print(root);
        // System.out.println("no. of node : " + countNodes(root));
        // System.out.println(largestDataNode(root));
        System.out.println(height(root));
        // printNodesAtK(root, 2);
        // System.out.println(countLeafNodes(root));
        // preOrderTraversal(root);
        // postOrderTraversal(root);
    }

}
