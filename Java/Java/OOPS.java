//INTERFACE

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed: " + speed + " gear " + gear);
    }
}

public class OOPS {
    public static void main(String[] args){
        
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.printStates();

    }
}
