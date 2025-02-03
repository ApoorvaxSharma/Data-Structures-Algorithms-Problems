package OPPs;

public class Abstraction {
    public static void main(String args[]){
        Dog dog1=new Dog();
        dog1.walk();

        dog1.name="Pluto";

        Fish fish1=new Fish();
        fish1.walk();
        fish1.changeName();
    }
}

abstract class Animal{
    String name;
    abstract void walk();

    Animal(){
        name="Dory";
        System.out.print(name+" ");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    void changeName(){
        name="alan";
    }
}
class Fish extends Animal{
    void walk(){
        System.out.println("Swims in water");
    }
    void changeName(){
        name="Sam";
    }
}
