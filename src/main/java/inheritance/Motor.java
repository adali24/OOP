package inheritance;

public class Motor extends Vehicle{

    public void twoWheel (){
        System.out.println("motor has two wheel");
    }

    public int whell = 2;

    public Motor (){
        System.out.println("motorParemetresiz");
    }

    public Motor (int whell){
        super(whell);
        System.out.println("motorParemetreli");

    }

}