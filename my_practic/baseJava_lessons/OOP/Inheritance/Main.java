package baseJava_lessons.OOP.Inheritance;

public class Main {
    public static void main(String args[]) {
        Cat albatros = new Cat("Albatros");
        albatros.speak();
    }
}

class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " says " + this.voice);
    }
}

class Cat extends Animal {

    public Cat(String name){
        super(name, "meow");
    }
}
