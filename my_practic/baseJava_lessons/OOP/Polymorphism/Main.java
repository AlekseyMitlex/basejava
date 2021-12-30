package baseJava_lessons.OOP.Polymorphism;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        Guitarist ritchie = new Guitarist("Ritchie");
        Keyboardist john = new Keyboardist("John");
        Musician david = new Musician("David");

        List<Musician> musicians = Arrays.asList(ritchie, john, david);

        for (Musician m : musicians){
            m.play();
        }
    }
}

class Musician {
    protected String name;
    public void play(){
        System.out.println(this.name + " plays anything he sees.");
    }

    public Musician(String name){
        this.name = name;
    }
}

class Guitarist extends Musician {

    public Guitarist(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.name + " plays a guitar.");
    }
}

class Keyboardist extends Musician {

    public Keyboardist(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.name + " plays a piano.");
    }
}
