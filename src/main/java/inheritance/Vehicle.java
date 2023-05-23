package inheritance;

public class Vehicle {

    public void start(){
        System.out.println("engine start....");
    }

    public void stop(){
        System.out.println("engine stop....");
    }

    public String model ="yeni araclar";
    public double price = 0;


    public Vehicle() {
        System.out.println("vehicleparametresiz1 ");
    }

    public Vehicle (int w) {
        System.out.println("vehicleparametreli1");
        //this.model = model;
        //  this.price = price;
    }


}