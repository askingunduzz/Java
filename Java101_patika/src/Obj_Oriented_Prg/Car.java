package Obj_Oriented_Prg;

public class Car {

    String type;
    String model;
    String color;
    int speed;
//constructor
    Car(String model,int speed){
        this.model="a";
        System.out.println(this.model);
        System.out.println(model);    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}

