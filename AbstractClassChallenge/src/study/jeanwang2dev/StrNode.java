package study.jeanwang2dev;

public class StrNode extends MyNode {

    public StrNode(String holdValue) {
        super(holdValue);
        // System.out.println("Created a node with value of " + holdValue);
    }

    // You should also specify a compareTo() method that takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.
    @Override
    public int compareTo(MyNode anotherNode) {
        if( anotherNode != null) {
            return ((String)getHoldValue()).compareTo((String)anotherNode.getHoldValue());
        } else {
            return -1;
        }

    }
}
