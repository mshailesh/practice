import java.util.LinkedList;
import java.util.List;

/**
 * Created by soham on 10/29/2017.
 */
public class TreeTraversal {
    LinkedList<Node> stack = new LinkedList<>();

    private void preOrderTraversal(Node root){
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

    public static void main(String[] args) {
        System.out.println("Test");

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.right.left = new Node(1);

        TreeTraversal tree = new TreeTraversal();
        tree.preOrderTraversal(root);


    }


}

