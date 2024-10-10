package vietnam;

import org.example.Animal;

public class SaoLa extends Animal {
    public void eat(){
        System.out.println("SaoLa " + name +
                "is eating " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Sao la is making noise");
    }
}
