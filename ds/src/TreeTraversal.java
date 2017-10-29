import java.util.LinkedList;
import java.util.List;

/**
 * Created by soham on 10/29/2017.
 */
public class TreeTraversal {


    private void preOrderTraversal(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        // iterative approach
        System.out.println(root);
        stack.addFirst(root);

        while (!stack.isEmpty()){
            Node popedItem = stack.removeFirst();
            System.out.println(popedItem.item);
            if(popedItem.right!=null){
                stack.addFirst(popedItem.right);
            }
            if(popedItem.left!=null){
                stack.addFirst(popedItem.left);
            }
        }
    }

    private void preOrderTraversal1(Node root){
        // recurssive approach
        System.out.println(root.item);
        if (root.left != null){
            preOrderTraversal1(root.left);

        }

        if (root.right != null){
            preOrderTraversal1(root.right);

        }
    }

    private void inorderTraversal(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        Node current = root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                if(current.left != null){
                   stack.addFirst(current);;
                   current = current.left;
                }else{
                    System.out.println(current.item);
                    current = current.right;
                }
            }else{
                Node temp = stack.removeFirst();
                System.out.println(temp.item);
                current = temp.right;
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("Test");

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(1);

        TreeTraversal tree = new TreeTraversal();
        tree.inorderTraversal(root);


    }


}

