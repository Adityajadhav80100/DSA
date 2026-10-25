
import java.util.*;
import java.util.LinkedList;
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



    // Top view of the tree
      static  class Info {
        int hd;
        Node node;
     
      public Info(int hd, Node node) {
        this.hd = hd;
        this.node = node;
      }
    }
    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        if (root == null) {
            return;
        }

        q.add(new Info(0, root));
        int min = 0;
        int max = 0;

        while(!q.isEmpty()){
            Info curr = q.remove();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }
            if (curr.node.left!=null) {
                q.add(new  Info(curr.hd-1,curr.node.left));
                min = Math.min(min, curr.hd-1);
            }
            
            if (curr.node.right!=null) {
                q.add(new  Info(curr.hd+1,curr.node.right));
                max = Math.max(max, curr.hd+1);
            }

        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data);
        }
        System.out.println();
    }

    // SubTree of another subTree
    public  static  boolean isIdentical(Node node , Node subRoot){
       if (node==null && subRoot == null) {
        return  true;
       }else if (node==null || subRoot== null || subRoot.data != node.data) {
        return  false;
       }
       if (!isIdentical(node.left, subRoot.left)) {
        return  false;
       }
       if (!isIdentical(node.right , subRoot.right)) {
        return  false;
       }
       return  true;

    }
    public static boolean isSubTree(Node root , Node subRoot){
        if (root==null) {
            return  false;
        }       
 
        if(root.data == subRoot.data){
          if (isIdentical( root , subRoot)) {
             return  true;
          }
        }
        return isSubTree(root.left , subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

      System.out.println(isSubTree(root, subRoot));

      topView(root);
    }
    
}
