import java.util.ArrayList;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    


    // Q6.transeform to sum tree    
    public static int sumTree(Node root){
        
        if (root==null) {
            return 0;
        }
        int leftSum=sumTree(root.left);
        int rightSum=sumTree(root.right);
        int data=root.data;
        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;
        root.data=leftData+leftSum+rightSum+rightData;
        return data;
    }

    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Q5. Kth Anccestor
 
   public  static int kAnccestor(Node root,int n, int k){
    if (root==null) {
        return -1;
    }
    if (root.data==n) {
        return 0;
    }
    int leftDis=kAnccestor(root.left, n, k);
    int rightDis=kAnccestor(root.right, n, k);
    if (leftDis==-1 && rightDis==-1) {
        return -1;
    }

    int max = Math.max(leftDis, rightDis);
    if (max+1 == k) {
        System.out.println(root.data);
    }
    return  max+1;
   }

    // Q4.  Minimum Distance between 2 Nodes.
    
    public  static int lcaDis(Node root, int n){
        if (root==null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

       int leftDis=lcaDis(root.left, n);
       int rightDis=lcaDis(root.right, n);
       if (leftDis==-1 && rightDis==-1) {
        return -1;
       }else if (leftDis==-1) {
          return  rightDis+1;
       }else{
        return leftDis+1;
       }

    }
    

    public  static int minDis(Node root , int n1 , int n2){
        Node lca = lca2(root, n1 , n2);
        int dist1 = lcaDis(lca, n1);
        int dist2 = lcaDis(lca, n2);
        return  dist1 + dist2;
    }





    // Q3.Lowest common ancestor of the tree (Approach 1) O(n) but space complexity is
    // high
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundLeft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // Remove .data here:
        return path1.get(i - 1);
    }

    // Lowest common ancestor of the tree (Approach 2) O(n) without using extra
    // space
    public static Node lca2(Node root, int n1, int n2) {
        // Change root == 0 to root == null
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    // Q1 Kth level of the tree
    public static void kLevel(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, k, level + 1);
        kLevel(root.right, k, level + 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3;
        kLevel(root, k, 1);
        System.out.println();
        int n1 = 4;
        int n2 = 7;

        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);

          
        System.out.println(minDis(root, n1,n2));
          int n=5; 
          int k1=2;
        System.out.println(kAnccestor(root, n, k1));

      sumTree(root);
     preOrder(root);
    }
}
