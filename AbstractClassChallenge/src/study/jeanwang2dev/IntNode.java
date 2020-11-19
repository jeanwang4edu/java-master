package study.jeanwang2dev;

public class IntNode extends MyNode{

    public IntNode(int holdValue) {
        super(holdValue);
        // System.out.println("Created a number with value of " + holdValue);
    }

    // You should also specify a compareTo() method that takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.
    @Override
    public int compareTo(MyNode anotherNode) {
        return  ((Integer)getHoldValue()).compareTo( (Integer)anotherNode.getHoldValue() );

    }
}
