import java.util.ArrayList;

public class BST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Q7. print  mirror of bst
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void prorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        prorder(root.left);
        prorder(root.right);
    }
//    Q6. validated BST
 public static boolean isValidBST(Node root, Node min, Node max){
    if(root==null){
        return true;
    }
    if(min!=null && root.data<=min.data){
        return false;
    }
    if(max!=null && root.data>=max.data){
        return false;
    }
    return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
 }

    // Q5 . print root to leaf
    public  static void printPath(ArrayList<Integer> path){
      for(int i=0; i<path.size();i++){
        System.out.print(path.get(i)+ "--> ");
      }
     System.out.print("null");
     System.out.println();
    }
    public  static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if (root==null) {
            return ;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }




    // Q4. print in range
   public static void printInRange(Node root, int k1, int k2) {
    if (root == null) {
        return;
    }
    
    // Case 1: Node is within the range [k1, k2]
    if (root.data >= k1 && root.data <= k2) {
        printInRange(root.left, k1, k2);
        System.out.print(root.data + " ");
        printInRange(root.right, k1, k2); // <-- Added this line
    } 
    // Case 2: Node is smaller than k1, search only in the right subtree
    else if (root.data < k1) {
        printInRange(root.right, k1, k2); // <-- Fixed this (was root.left)
    } 
    // Case 3: Node is greater than k2, search only in the left subtree
    else {
        printInRange(root.left, k1, k2);  // <-- Fixed this (was root.right)
    }
}

    // Q3 Delete a node case: 1. no child case: 2. single child case: 3. both child

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 : both child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Q2.Search in BST O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    // Q1.build bst
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println();
        System.out.println(isValidBST(root,null,null));
        System.out.println();
        inorder(root);
        printRoot2Leaf(root,new ArrayList<>());
         
        inorder(root);
        System.out.println();
        int key = 5;
        System.out.println(search(root, key));
        System.out.println();
        System.out.println(delete(root, 5).data);
        inorder(root);
        System.out.println();
        
        printInRange(root, 5,12);

        // Test mirror at the end (since mirroring destroys BST ordering properties)
        root = mirror(root);
        System.out.println("Inorder traversal of mirrored tree:");
        prorder(root);
        System.out.println();
 
    }
}
