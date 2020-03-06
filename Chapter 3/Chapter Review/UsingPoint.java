/**
 * Write the implementation of each method in the following incomplete class,
 * UsingPoint, as described in the comment. (Use the method in the Point class)
 *
 * @author hawyarfarooq
 */

public class UsingPoint {

    public static class Point {

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
    }

    /**
     * @param coordinates of the first of type Point
     * @param coordinates of the second of type Point
     * @return the slope of the line formed by the two points
     */
    public double slope(Point pointA, Point pointB) {
        double slope = (pointB.yC() - pointA.yC()) / (pointB.xC() - pointA.xC());

        return slope;

    }

    /**
     * @param coordinates of the first of type Point
     * @param coordinates of the second of type Point
     * @return the distance between the two points
     */
    public double distance(Point pointA, Point pointB) {
        double distance = Math.sqrt(Math.pow(pointA.yC() - pointA.xC(), 2) + Math.pow(pointB.yC() - pointB.xC(), 2));

        return distance;
    }

    // displays the coordinates of the two points
    public void display(Point pointA, Point pointB) {
        System.out.println("(" + pointA.xC() + "," + pointA.yC() + ")");
        System.out.println("(" + pointB.xC() + "," + pointB.yC() + ")");
    }


    // The main method to test and dispplay the results
    public static void main(String[] args) {

        /*
         * The following block of code is to test the methods above
         * Remove the comments and change the numbers passed into the the two Point instances
         */

//        Point pointA = new Point(2,4);
//        Point pointB = new Point(4,9);
//
//        UsingPoint newPoint = new UsingPoint();
//        newPoint.display(pointA, pointB);
//
//        System.out.println("Distance = " + newPoint.distance(pointA, pointB));
//        System.out.println("Slope = " + newPoint.slope(pointA, pointB));
    }
}