package study.jeanwang2dev;

public interface NodeList {
    MyNode getHeadNode();
    boolean add(MyNode newNode);
    boolean remove(MyNode node);
    void traverse(MyNode root);
}
