
interface Animal {
    void bark();
   default void sleep(){
        System.out.println("animal is sleeping");
    }
}

interface Pet {
    void ownerName();
}

class Dog implements Animal, Pet {
    public void bark(){
        System.out.println("Dog barks!!!");
    }
    
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void ownerName(){
        System.out.println("name : Sheru");
    }
}

class Cat implements Animal {
    public void bark(){
        System.out.println("Meooow!!!");
    }
    
    public void sleep(){
        System.out.println("cat is sleeping");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.sleep();
        d1.ownerName();

        System.out.println("-------------------------");


        Cat c1 = new Cat();
        c1.bark();
        c1.sleep();

        Animal a ;
        a = new Dog();
        ((Dog)a).ownerName();
    }
}
