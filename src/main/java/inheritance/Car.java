package inheritance;

public class Car extends Vehicle {

    public void fourwheel (){
        System.out.println("cars have fourwheel");
    }

    public String modell = " BMW";
    public int pricee = 200;

    public Car(){
        System.out.println("CarParametresiz");
    }

    public Car(String modell,double pricee){
        System.out.println("CarParametreli");
    }

}