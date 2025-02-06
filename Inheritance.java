class Animal{
    void eat(){
        System.out.println("This animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("Cats say meow");
    }
}


public class Inheritance {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.bark();
        obj.eat();

        Cat obj1 = new Cat();
        obj1.bark();
        obj1.meow();
        obj1.eat();

        //✅ Multi-Level Inheritance means a child class can inherit from another child class.
        //❌ Java doesn’t support multiple inheritance with classes (a class cannot inherit from multiple classes directly).


    }
}
