import java.util.LinkedList;
import java.util.Queue;

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

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // height of tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;

        }

        // node count
        public static int nodeCount(Node root) {
            if (root == null) {
                return 0;
            }
            int lcount = nodeCount(root.left);
            int rcount = nodeCount(root.right);
            return lcount + rcount + 1;
        }

        // sum of nodes
        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum + rsum + root.data;
        }

        // diameter of tree O(n^2) Approach 1
        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int ldia = diameter(root.left);
            int rdia = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfdia = lh + rh + 1;
            return Math.max(selfdia, Math.max(ldia, rdia));
        }

        // diameter of tree O(n) Approach 2

        static class Info {
            int diaM;
            int ht1;

            public Info(int diaM, int ht1) {
                this.diaM = diaM;
                 this.ht1= ht1;
            }
        }

        public  static Info diameter2(Node root){
            if (root==null) {
                return new  Info(0,0);
            }
            Info lInfo=diameter2(root.left);
            Info rInfo=diameter2(root.right);

            int dia = Math.max(Math.max(lInfo.diaM, rInfo.diaM), lInfo.ht1+rInfo.ht1+1);
            int ht = Math.max(lInfo.ht1, rInfo.ht1)+ 1;

            return new Info(dia,ht);
        }

    }

    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Node root=binaryTree.buildTree(nodes);
        // System.out.println(root.data);
        // binaryTree.preOrder(root);
        // System.out.println();
        // binaryTree.inOrder(root);
        // System.out.println();
        // binaryTree.postOrder(root);
        // System.out.println();
        // binaryTree.levelOrder(root);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right = new Node(7);

        System.out.println("Height of the tree: " + binaryTree.height(root));
        System.out.println("count of node of the tree: " + binaryTree.nodeCount(root));
        System.out.println("sum of node of the tree: " + binaryTree.sum(root));
        System.out.println("diameter of the tree: " + binaryTree.diameter(root));
        System.out.println("diameter of the tree: " + binaryTree.diameter2(root).diaM);
    }
}
