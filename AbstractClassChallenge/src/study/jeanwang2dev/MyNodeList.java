package study.jeanwang2dev;

public class MyNodeList implements NodeList {

    private MyNode headNode = null;

    public MyNodeList(MyNode node) {
        this.headNode = node;
    }

    public MyNode getHeadNode() {
        return headNode;
    }

    // The rules for adding an item to the linked list are:
    //  If the head of the list is null, make the head refer to the item to be added.
    //  If the item to be added is less than the current item in the list, add the item before the
    //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
    //      "next" refer to the current item).
    //  If the item to be added is greater than the current item, move onto the next item and compare
    //      again (if there is no next item then that is where the new item belongs).
    //
    // Care will be needed when inserting before the first item in the list (as it will not have a previous
    // item).
    @Override
    public boolean add(MyNode newNode){
//        System.out.println("================try to add new Node " + newNode.getHoldValue() + " =================");
        if(headNode == null){
            // the list is empty, so newNode is the first item
            headNode = newNode;
//            System.out.println("added headNode " + headNode.getHoldValue());
            return true;
        }
        MyNode currentNode = headNode;
        while ( currentNode != null ) {
            int result = currentNode.compareTo(newNode);
            if( result < 0 ){
                // the newNode value is greater than the current Node,
                if( currentNode.getNext() != null ){
                    // move onto the next node to compare
                    currentNode = currentNode.getNext();
                } else {
                    // the end of the list, add newNode to the end;
                    currentNode.setNext(newNode);
                    newNode.setPrevious(currentNode);
//                    System.out.println("Node " + newNode.getHoldValue() + " is added");
                    return true;
                }
            } else if ( result > 0 ){
                // the newNode value is less than the current Node, should add before current node
                if( currentNode.getPrevious() != null ) {
                    currentNode.getPrevious().setNext(newNode);
                    newNode.setPrevious(currentNode.getPrevious());
                    newNode.setNext(currentNode);
                    currentNode.setPrevious(newNode);
//                    System.out.println("Node " + newNode.getHoldValue() + " is added");
                } else {
                    // insert before head
                    newNode.setNext(headNode);
                    headNode.setPrevious(newNode);
                    headNode = newNode;
//                    System.out.println("Node " + newNode.getHoldValue() + " is added!!");
                }
                return true;
            } else {
                // result == 0
                System.out.println("Node with value " + newNode.getHoldValue() + " already exists.");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean remove(MyNode node) {
//        if(headNode == null){
//            // the list is empty, nothing to remove
//            return false;
//        }
        if( node != null ){
            System.out.println("Deleting item " + node.getHoldValue());
        }
        MyNode currentNode = headNode;
        while( currentNode != null ){
            int comparison = currentNode.compareTo(node);
            if( comparison == 0 ){
                // match, remove the node
                System.out.println("match!");
                if( this.headNode == currentNode ){
                    headNode = currentNode.getNext();
                    headNode.setPrevious(null);
                } else {
                    currentNode.getPrevious().setNext(currentNode.getNext());
                    if( currentNode.getNext() != null ){
                        currentNode.getNext().setPrevious(currentNode.getPrevious());
                    } // if it is the last node then do nothing
                }
                System.out.println(currentNode.getHoldValue() + " got deleted!");
                return true;
            } else {
                if( currentNode.getNext() != null){
                    currentNode = currentNode.getNext();
                } else {
                    // reach the end of the list, no match node found
                    System.out.println("item to be removed does not exist in the list");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(MyNode root) {
        System.out.println("======================================");
//        System.out.println("There are " + myList.getSize()  +" nodes in the list");
        MyNode node = root;
        if( node == null ){
            System.out.println("The list is empty");
        } else {
            while (node != null) {
                System.out.println("Node: " + node.getHoldValue());
                node = node.getNext();
            }
        }
    }
}








