public class CircleRunner {
    public static void main(String[] args){
        Circle cir = new Circle(5.0);
        System.out.println(cir.getInfo());
        cir.setRadius(9.2);
        System.out.println(cir.getInfo());
        cir.setRadius(2.4);
        System.out.println(cir.getInfo());

        double x = 6.5;
        double thirdPower = Math.pow(x,3);
        System.out.println(thirdPower);


    }
}
