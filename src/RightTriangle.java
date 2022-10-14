public class RightTriangle {
    //instance variables
    private double base;
    private double height;

    //constructor
    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // method that returns length of hypotenuse (double) using Pythagorean Theorem
    public double hypotenuse(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
