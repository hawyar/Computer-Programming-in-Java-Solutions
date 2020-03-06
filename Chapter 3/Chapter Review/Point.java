/**
 * Write the implementation of each method in the following incomplete
 * class as described in the comments
 *
 * @author hawyarfarooq
 */

public class Point {

    private double x;
    private double y;

    // Constructor to initialize the coordinate of a point object
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Returns the x coordinate of a point object
    public double xC() {
        return this.x;
    }

    // Returns the y coordinate of a point object
    public double yC() {
        return this.y;
    }

    // Prints the coordinate of a point object in the form (x,y)
    public void display() {
        System.out.println("(" + xC() + "," + yC() + ")");
    }

    // The main method to test and display the results
    public static void main(String[] args) {

        /*
         * The following block of code is to test the three methods above.
         * Remove the comments and change the numbers passed into the Point instance.
         */

//        Point p = new Point(3, 5);
//        p.display();

    }
}
