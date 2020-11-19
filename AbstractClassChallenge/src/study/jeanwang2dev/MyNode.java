package study.jeanwang2dev;

public abstract class MyNode {

    protected Object holdValue;
    protected MyNode previous;
    protected MyNode next;

    public MyNode(Object holdValue) {
        this.holdValue = holdValue;
        this.previous = null;
        this.next = null;
    }

    public Object getHoldValue() {
        return holdValue;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public MyNode getNext() {
        return next;
    }

    public void setHoldValue(Object holdValue) {
        this.holdValue = holdValue;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    // You should also specify a compareTo() method that takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.
    public abstract int compareTo(MyNode anotherNode);


}
