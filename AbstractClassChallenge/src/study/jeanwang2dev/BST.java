package study.jeanwang2dev;

public class BST implements NodeList {

    private MyNode root;

    public BST(MyNode root) {
        this.root = root;
    }

    @Override
    public MyNode getHeadNode() {
        return root;
    }

    // no duplicate record
    @Override
    public boolean add(MyNode node) {
        if( root == null){
            root = node;
            return true;
        }
        MyNode currentNode = root;
        while( true){
            int comparison = currentNode.compareTo(node);
            if( comparison < 0 ){
                // the newNode value is greater than or equal to the current Node,
                if( currentNode.getNext() == null ){
                    currentNode.setNext(node);
                    return true;
                } else {
                    currentNode = currentNode.getNext();
                }
            } else if (comparison > 0){
                // the newNode value is smaller than the current Node,
                if( currentNode.getPrevious() == null){
                    currentNode.setPrevious(node);
                    return true;
                } else {
                    currentNode = currentNode.getPrevious();
                }
            } else {
                // equal, not add
                System.out.println("node with value " + node.getHoldValue() + " already exists");
                return false;
            }
        }
        // return false;
    }

    @Override
    public boolean remove(MyNode node) {
        if( node != null){
            System.out.println("Deleting node " + node.getHoldValue());
        }
        MyNode currentNode = root;
        MyNode currentParentNode = currentNode;

        while( currentNode != null){
            int comparison= currentNode.compareTo(node);
            if( comparison < 0 ){
                // node is bigger than currentNode, turn right
                if( currentNode.getNext() != null ){
                    currentParentNode = currentNode;
                    currentNode = currentNode.getNext();
                } else {
                    // node not exist
                    System.out.println("node " + node.getHoldValue() + " not exist in list");
                }
            } else if ( comparison > 0 ) {
                // node is smaller than currentNode, turn left
                if( currentNode.getPrevious() != null ){
                    currentParentNode = currentNode;
                    currentNode = currentNode.getPrevious();
                } else {
                    // node not exist
                    System.out.println("node " + node.getHoldValue() + " not exist in list");
                }
            } else {
                // compareTo equals to zero, found node, remove
                performRemoveAction(currentNode, currentParentNode);
                return true;
            }

        }
        return false;
    }

    /**
     * Inorder traverse
     */
    @Override
    public void traverse(MyNode node) {
        if( node != null ) {
            traverse( node.getPrevious() );
            System.out.println( node.getHoldValue());
            traverse( node.getNext() );
        }
    }

    private void performRemoveAction(MyNode node, MyNode parentNode){
        if( node.getNext() == null ) {
            // no right tree, make parent point to left tree(may be null)
            if (parentNode.getNext() == node) {
                // node is right child of parent
                parentNode.setNext(node.getPrevious());
            } else if (parentNode.getPrevious() == node) {
                // node is the left child of parent
                parentNode.setPrevious(node.getPrevious());
            } else {
                // parent is node, node to remove is root
                // use root's left tree to replace root
                root = node.getPrevious();
            }
        } else if( node.getPrevious() == null) {
            // no left tree, make parent point to right tree(may be null)
            if (parentNode.getNext() == node) {
                // node is right child of parent
                parentNode.setNext(node.getNext());
            } else if( parentNode.getPrevious() == node ){
                // node is the left child of parent
                parentNode.setPrevious(node.getNext());
            } else {
                // parent is node, node to remove is root
                // use root's right tree to replace root
                root = node.getNext();
            }
        } else {
            // both left and right children exists
            // use the smallest value replace current node value
            // and delete the smallest node
            MyNode current = node.getPrevious();
            MyNode leftmostParent = node;
            while( current.getPrevious() != null){
                leftmostParent = current;
                current = current.getPrevious();
            }
            node.setHoldValue(current.getHoldValue());
            if( leftmostParent == node) {
                node.setNext(current.next);
            } else {
                leftmostParent.setPrevious(current.getNext());
            }
        }


    }

//    private Object getSmallestValue(MyNode node){
//        MyNode currentNode = node;
//        while( currentNode.getPrevious() != null ){
//            currentNode = currentNode.getPrevious();
//        }
//        return currentNode.getHoldValue();
//    }
}
