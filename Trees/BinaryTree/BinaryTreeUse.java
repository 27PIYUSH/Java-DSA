package Trees.BinaryTree;
import java.util.*;

public class BinaryTreeUse {

    // Take input --> recursively
    public static BinaryTreeNode<Integer> takeInput(Scanner scn){
        System.out.print("Enter root data: ");
        int rootData = scn.nextInt(); 
        if (rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.left = takeInput(scn);
        root.right = takeInput(scn);
        return root;
    }

    // print
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null) return;
        String s = root.data + ": ";
        if(root.left != null){
            s += "L:" + root.left.data +" ";
        }
        if(root.right != null){
            s += "R:" + root.right.data +" ";
        }
        System.out.println(s);
        printTree(root.left);
        printTree(root.right);
    }

    // Take input --> iteratively
    public static BinaryTreeNode<Integer> takeInputLineWise(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter root data: ");
        int rootData = scn.nextInt();
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.print("Enter left child of "+ front.data + " ");
            int leftChild = scn.nextInt();
            if(leftChild != -1){
                BinaryTreeNode<Integer> lchild = new BinaryTreeNode<Integer>(leftChild);
                pendingNodes.add(lchild);
                front.left = lchild;
            }

            System.out.print("Enter right child of "+ front.data + " ");
            int rightChild = scn.nextInt();
            if(rightChild != -1){
                BinaryTreeNode<Integer> rchild = new BinaryTreeNode<Integer>(rightChild);
                pendingNodes.add(rchild);
                front.right = rchild;
            }
        }
        return root;
    }
    
    // count nodes
    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int count = 1;
        count +=  countNodes(root.left);
        count += countNodes(root.right);

        return count;
    } 

    // diameter of binary tree --> O(N*H) {n = no. of nodes, h= height of the tree} 
    /* function baar baar calculate krega height and diameter same node issliye time complexity bdegi --> O(N*H) */
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root == null) return 0;

        int option1 = diameter(root.left);
        int option2 = diameter(root.right);
        int option3 = height(root.left) + height(root.right);

        return Math.max(option1,Math.max(option2,option3));
    }

    // height
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // optimised way --> diameter of binary tree
    public static Pairs<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root == null){
            Pairs<Integer,Integer> ans = new Pairs<>();
            ans.first = 0; // first = height
            ans.second = 0; // second = diameter
            return ans;
        }

        Pairs<Integer,Integer> lo = heightDiameter(root.left); // left output --> left height & left diameter
        Pairs<Integer,Integer> ro = heightDiameter(root.right);  // right output --> right height & right diameter
        int height = 1 + Math.max(lo.first, ro.first);  // max height 

        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;

        int diameter = Math.max(option1,Math.max(option2, option3));
        Pairs<Integer,Integer> ans = new Pairs<>();
        ans.first = height; 
        ans.second = diameter;
        return ans;

    }

    // Traversal::: DFS
    // 1) Inorder traversal --> Left Root Right
    public static void Inorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    // 2) Preorder traversal --> Root Left Right 
    public static void Preorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    // 3) Postorder traversal --> Left Right Root
    public static void Postorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Traversal::: BFS (level order traversal)
    public static void PrintLevelOrder(BinaryTreeNode<Integer> root){
        if(root == null) return;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelnum = q.size();
            for(int i = 0; i<levelnum ; i++){
                BinaryTreeNode<Integer> node = q.peek();
                System.out.print(node.data+ " ");
                q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            System.out.println();
        }
    }

    // method 2
    public static void PrintLevelOrder2(BinaryTreeNode<Integer> root){
        if(root == null) return;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelnum = q.size();
            for(int i = 0; i<levelnum ; i++){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                System.out.print(q.poll().data + " ");
            }
            System.out.println();
        }
    }

    // Traversals::: iterative using stacks
    // Preorder --> for stack insert root --> right --> left
    public static void printIterativePreorder(BinaryTreeNode<Integer> root){
        if(root == null) return;

        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            root = s.pop();
            System.out.print(root.data + " ");
            if(root.right != null){
                s.push(root.right);
            }
            if(root.left != null){
                s.push(root.left);
            }
        }
    }

    // Postorder
    public static void printIterativePostorder(BinaryTreeNode<Integer> root){
        if(root == null) return;

        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            root = s.pop();
            System.out.print(root.data + " ");
            if(root.right != null){
                s.push(root.right);
            }
            if(root.left != null){
                s.push(root.left);
            }
        }
    }

    // Inorder
    public static void printIterativeInorder(BinaryTreeNode<Integer> root){
        if(root == null) return;

        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            
            if(root.right != null){
                s.push(root.right);
            }
            root = s.pop();
            System.out.print(root.data + " ");
            if(root.left != null){
                s.push(root.left);
            }
        }
    }

     
    // build tree using inorder and preorder
    public static BinaryTreeNode<Integer> buildTree(BinaryTreeNode<Integer> root){
        return root;
    }



    public static void main(String[] args) {
        // Create a binary tree
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        // root.left = node1;
        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        // root.right = node2;

        // System.out.println(root);
        // Scanner scn = new Scanner(System.in);
        // BinaryTreeNode<Integer> root = takeInput(scn);
        BinaryTreeNode<Integer> root = takeInputLineWise();
        printTree(root); 
        // System.out.println(countNodes(root));
        // System.out.println("Diameter: " + diameter(root));
        // System.out.println("Diameter: " + heightDiameter(root).second);
        // System.out.println("Height: " + heightDiameter(root).first);
        // Inorder(root);
        // Preorder(root);
        // Postorder(root);
        // PrintLevelOrder(root);
        // PrintLevelOrder2(root);
        // printIterativePreorder(root);
        printIterativeInorder(root);
        // scn.close();
    }
}
