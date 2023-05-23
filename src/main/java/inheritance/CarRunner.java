package inheritance;

public class CarRunner {

    public static void main(String[] args) {

        Vehicle c1 = new Vehicle();
        c1.start();
        c1.stop();

        Car c2 = new Car();
        c2.start();
        c2.stop();
        c2.fourwheel();

        Motor c3= new Motor();
        c3.start();
        c3.stop();
        c3.twoWheel();

        System.out.println("**********************************");

        c1.model="Honda";
        System.out.println(c1.model);

        System.out.println(c1.model);

        c1.price=1000.55;
        System.out.println(c1.price);

        //   System.out.println(c2.modell);

        System.out.println(c3.whell);

        System.out.println("***************************************");

        Vehicle c4= new Vehicle();
        System.out.println("**");
        Car c5= new Car();
        System.out.println("*********");
        //  Vehicle c6= new Vehicle("Toyota",5000);
        System.out.println("***");
        Car c7= new Car("Volvo",5000);
        System.out.println("*********");
        Motor c8 = new Motor(2);

    }
}