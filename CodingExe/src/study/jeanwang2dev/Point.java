package study.jeanwang2dev;

public class Point {

    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt( x * x + y * y );
    }

    public double distance(int x, int y){
        return Math.sqrt( Math.pow( Math.abs(x - this.x), 2) + Math.pow(Math.abs(y - this.y), 2) );
    }

    public double distance(Point p){
        return Math.sqrt( Math.pow( Math.abs(p.getX() - this.x), 2) + Math.pow(Math.abs(p.getY() - this.y), 2) );
    }
}
